package spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import spring.constant.URLConstant;
import spring.constant.ViewNameConstant;
import spring.model.Blog;
import spring.model.Category;
import spring.model.Contact;
import spring.service.BlogService;
import spring.service.CategoryService;
import spring.validate.ContactValidate;

@Controller
public class ProjectController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private BlogService blogService;
	
	@Autowired
	private ContactValidate contactValidate;

	@ModelAttribute
	public void setModelCat(Model model) {
		List<Category> listCat = categoryService.getAll();
		model.addAttribute("listCat", listCat);
	}

	@GetMapping(URLConstant.URL_INDEX)
	public String index(Model model) {
		List<Blog> listBlogNew = blogService.getListNew();
		model.addAttribute("listBlogNew", listBlogNew);
		List<Blog> listBlogByViews = blogService.getListByViews();
		model.addAttribute("listBlogByViews", listBlogByViews);
		return ViewNameConstant.INDEX;
	}

	@GetMapping(URLConstant.URL_DETAIL)
	public String detail(@PathVariable int id, Model model) {
		Blog blog = blogService.findById(id);
		if (blog == null) {
			return "redirect:/" + URLConstant.URL_INDEX;
		}
		model.addAttribute("blog", blog);
		List<Blog> listBlogRelate = blogService.getListRelate(id, blog.getCat().getId());
		model.addAttribute("listBlogRelate", listBlogRelate);
		return ViewNameConstant.DETAIL;
	}

	@GetMapping(URLConstant.URL_CONTACT)
	public String contact() {
		return ViewNameConstant.CONTACT;
	}

	@PostMapping(URLConstant.URL_CONTACT)
	public String contact(@Valid @ModelAttribute("ct") Contact contact, BindingResult rs, RedirectAttributes ra,
			Model model) {
		contactValidate.validatePhone(contact, rs);
		if (rs.hasErrors()) {
			model.addAttribute("contact", contact);
			return ViewNameConstant.CONTACT;
		}
		
		return "redirect:/" + URLConstant.URL_CONTACT;
	}

}

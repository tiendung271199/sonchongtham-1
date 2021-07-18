package spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import spring.constant.URLConstant;
import spring.constant.ViewNameConstant;
import spring.model.Blog;
import spring.model.Category;
import spring.service.BlogService;
import spring.service.CategoryService;

@Controller
public class ProjectController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private BlogService blogService;

	@ModelAttribute
	public void setModelCat(Model model) {
		List<Category> listCat = categoryService.getAll();
		model.addAttribute("listCat", listCat);
	}

	@GetMapping(URLConstant.URL_EMPTY)
	public String index(Model model) {
		List<Blog> listBlogNew = blogService.getListNew();
		model.addAttribute("listBlogNew", listBlogNew);
		List<Blog> listBlogByViews = blogService.getListByViews();
		model.addAttribute("listBlogByViews", listBlogByViews);
		return ViewNameConstant.VIEW_INDEX;
	}

	@GetMapping(URLConstant.URL_DETAIL)
	public String detail() {
		return ViewNameConstant.VIEW_DETAIL;
	}

	@GetMapping(URLConstant.URL_CONTACT)
	public String contact() {
		return ViewNameConstant.VIEW_CONTACT;
	}

}

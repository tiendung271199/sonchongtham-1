package spring.controller.admin;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import spring.constant.URLConstant;
import spring.constant.ViewNameConstant;
import spring.model.Category;
import spring.service.CategoryService;

@Controller
@RequestMapping(URLConstant.URL_ADMIN)
public class AdminCategoryController {
	
	@Autowired
	MessageSource messageSource;
	
	@Autowired
	CategoryService catService;
	
	
	@GetMapping(URLConstant.URL_ADMIN_CAT_INDEX)
	public String index(Model model) {
		
		model.addAttribute("listCat", catService.getAll());
		return ViewNameConstant.CAT_INDEX;		
	}
	
	@GetMapping(URLConstant.URL_ADMIN_CAT_ADD)
	public String add() {
		return ViewNameConstant.CAT_ADD;
	}
	
	
	@PostMapping(URLConstant.URL_ADMIN_CAT_ADD)
	public String add(@Valid @ModelAttribute("cat") Category cat,
			BindingResult br,
			RedirectAttributes rd) {
		if(br.hasErrors()) {
			return ViewNameConstant.CAT_ADD;
		}
		if(catService.save(cat)>0) {
			rd.addFlashAttribute("msg", messageSource.getMessage("msg.success", null,Locale.getDefault() ));
			return "redirect:/admin/danh-muc.html";
		}
		return ViewNameConstant.CAT_INDEX;
	}
	
	@GetMapping(URLConstant.URL_ADMIN_CAT_EDIT)
	public String edit(@PathVariable("id") Integer id) {
		return ViewNameConstant.CAT_ADD;
	}

}

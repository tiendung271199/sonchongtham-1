package spring.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import spring.model.Category;
import spring.service.CategoryService;

@Controller
public class DemoController {
	
	@Autowired
	private CategoryService categoryService;

	@GetMapping("demo")
	public String demo(Model model) {
		List<Category> listCat = categoryService.getAll();
		model.addAttribute("listCat", listCat);
		return "demo/demo";
	}
	
}

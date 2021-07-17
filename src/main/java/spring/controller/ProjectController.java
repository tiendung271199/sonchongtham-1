package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import spring.constant.URLConstant;
import spring.constant.ViewNameConstant;

@Controller
public class ProjectController {

	@GetMapping(URLConstant.URL_EMPTY)
	public String index() {
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

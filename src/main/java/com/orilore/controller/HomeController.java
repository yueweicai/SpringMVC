package com.orilore.controller;

import java.util.Locale;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.orilore.service.ISchoolService;

@Controller
public class HomeController {
	@Resource
	private ISchoolService service;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		model.addAttribute("list", this.service.query());
		return "home";
	}
}

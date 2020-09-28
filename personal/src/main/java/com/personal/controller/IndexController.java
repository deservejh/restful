package com.personal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping({"/", "/index"})
	public String index(Model model) {
		model.addAttribute("test", "12345");
		return "index";
	}
	
	@GetMapping({"/login"})
	public void login() {
	}

}

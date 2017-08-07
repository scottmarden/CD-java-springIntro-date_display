package com.scottmarden.displaydate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {
	Date now = new Date();
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("now", now);
		return "index.jsp";
	}
	
	
}

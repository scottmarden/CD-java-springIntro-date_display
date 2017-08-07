package com.scottmarden.displaydate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateCtrl {
	Date now = new Date();
	
	@RequestMapping("/show_date")
	public String date(Model model) {
		model.addAttribute("now", now);
		return "date.jsp";
	}
}

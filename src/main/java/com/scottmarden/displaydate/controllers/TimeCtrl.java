package com.scottmarden.displaydate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeCtrl {
	Date now = new Date();
	
	@RequestMapping("/show_time")
	public String time(Model model) {
		model.addAttribute("now", now);
		return "time.jsp";
	}
}

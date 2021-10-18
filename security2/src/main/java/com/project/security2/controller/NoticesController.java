package com.project.security2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticesController {
	
	@GetMapping("/notices")
	public String getNotices(String input) {
		return "Here are the notices details from the DB";
	}
	
}

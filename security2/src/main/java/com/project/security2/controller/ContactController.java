package com.project.security2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
	
	@GetMapping("/contact")
	public String saveContactInquiryDetails(String input) {
		return "Inquiry details are saved to the DB";
	}
	
}

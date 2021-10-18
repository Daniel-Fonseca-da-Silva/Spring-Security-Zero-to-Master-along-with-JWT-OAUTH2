package com.project.security2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContactController {
	
	@GetMapping("/contact")
	public @ResponseBody String saveContactInquiryDetails(String input) {
		return "Inquiry details are saved to the DB";
	}
	
}

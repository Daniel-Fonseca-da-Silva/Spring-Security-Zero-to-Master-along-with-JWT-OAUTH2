package com.project.security2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NoticesController {
	
	@GetMapping("/notices")
	public @ResponseBody String getNotices(String input) {
		return "Here are the notices details from the DB";
	}
	
}

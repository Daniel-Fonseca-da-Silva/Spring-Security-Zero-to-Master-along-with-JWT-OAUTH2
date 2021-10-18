package com.project.security2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
	
	@GetMapping("/myAccount")
	public String getAccountDetails(String input) {
		return "Here are the account details from the DB";
	}
	
}

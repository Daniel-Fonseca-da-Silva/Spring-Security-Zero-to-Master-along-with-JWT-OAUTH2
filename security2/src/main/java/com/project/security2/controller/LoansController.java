package com.project.security2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoansController {
	
	@GetMapping("/myLoans")
	public String getLoanDetails(String input) {
		return "Here are the loan details from the DB";
	}
	
}

package com.project.security2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardsController {
	
	@GetMapping("/myCards")
	public String getCardDetails(String input) {
		return "Here are the card details from the DB";
	}
	
}

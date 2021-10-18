package com.project.security2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CardsController {
	
	@GetMapping("/myCards")
	public @ResponseBody String getCardDetails(String input) {
		return "Here are the card details from the DB";
	}
	
}

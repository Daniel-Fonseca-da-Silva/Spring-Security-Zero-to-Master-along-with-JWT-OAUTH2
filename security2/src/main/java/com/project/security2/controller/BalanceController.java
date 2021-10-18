package com.project.security2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BalanceController {

	@GetMapping("/myBalance")
	public @ResponseBody String getBalanceDetails(String input) {
		return "Here are the balance details from the DB";
	}

}

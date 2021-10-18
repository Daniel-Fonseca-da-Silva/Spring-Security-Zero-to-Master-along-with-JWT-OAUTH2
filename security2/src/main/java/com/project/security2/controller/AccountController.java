package com.project.security2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {

	@GetMapping("/myAccount")
	public @ResponseBody String getAccountDetails(String input) {
		return "Here are the account details from the DB";
	}

}

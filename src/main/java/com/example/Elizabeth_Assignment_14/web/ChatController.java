package com.example.Elizabeth_Assignment_14.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

	@GetMapping("/welcome") 
	public String getWelcomePage() {
	return null;
	}
}

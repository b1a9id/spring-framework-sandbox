package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class WelcomeController {

	@GetMapping("/jsp")
	public String helloJsp() {
		return "jsp/hello/index";
	}

	@GetMapping("/thymeleaf")
	public String helloThymeleaf() {
		return "thymeleaf/hello/index";
	}
}

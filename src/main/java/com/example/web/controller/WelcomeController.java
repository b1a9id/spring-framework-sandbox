package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class WelcomeController {

	@GetMapping
	public String hello() {
		return "jsp/hello/index";
	}
}

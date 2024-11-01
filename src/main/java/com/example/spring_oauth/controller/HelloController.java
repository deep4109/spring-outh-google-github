package com.example.spring_oauth.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("hello")
	public String greet() {
		return "Hello OAuth ";
	}
	
	@GetMapping("about")
	public String about(HttpServletRequest request) {
		return "Telusko "+request.getSession().getId();
	}
}

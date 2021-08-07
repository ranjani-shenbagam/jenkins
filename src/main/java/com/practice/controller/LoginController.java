package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	

	@GetMapping("/frontpage")
	public String showhome() {
		return "restaurant";
	}}

package com.heng.soar.modelCore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

	@GetMapping("/index")
	public String login() {

		return "index";
	}
	@GetMapping("/kk")
	public String kk() {

		return "kk";
	}
}

package com.heng.soar.modelCore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heng.soar.model.User;
import com.heng.soar.modelCore.service.UserService;

@RestController
@RequestMapping("/heng")
public class UserController {
	@Autowired
	UserService service;
	  @Value("${server.portt}")
	String aa ;

	@GetMapping("/getUserById/{id}")
	public User getUserById(@PathVariable String id) {
		User user = service.getUserByName(id);
	System.out.print(aa);
		return user;
	}

}
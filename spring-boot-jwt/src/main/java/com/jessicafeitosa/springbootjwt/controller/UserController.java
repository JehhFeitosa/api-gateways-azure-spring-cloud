package com.jessicafeitosa.springbootjwt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jessicafeitosa.springbootjwt.data.UserData;
import com.jessicafeitosa.springbootjwt.service.UserDetailServiceImpl;

@RestController
public class UserController {
	
	private final UserDetailServiceImpl userDetailService;

	public UserController(UserDetailServiceImpl userDetailService) {
		this.userDetailService = userDetailService;
	}

	@RequestMapping("all-users")
	public List<UserData> listAllUsers(){
		return userDetailService.listUsers();
	}
}

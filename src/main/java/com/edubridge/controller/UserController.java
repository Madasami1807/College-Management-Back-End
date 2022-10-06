package com.edubridge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.edubridge.entity.User;
import com.edubridge.services.UserServices;



@Controller
public class UserController {

	
	@Autowired UserServices userServices;
	
	@PostMapping("/createUser")
	public User createUser(User user) {
		return userServices.createUser(user);
	}
	
	/*
	//get user by id
	public User findById(int id) {
		return userServices.findUserById(id);
			
	}
	
	*/

	
	
}

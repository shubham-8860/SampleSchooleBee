package com.school.bee.project.SpringBootSchoolBee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@RequestMapping(value="/login" , method = RequestMethod.GET)
	public String login() {
		return "You are Successfully LoggedIn for Conflict";
	}

}

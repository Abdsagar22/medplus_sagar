package com.jsp.medicworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.medicworld.entity.User;
import com.jsp.medicworld.service.UserService;abstract

@RestController
@CrossOrigin

public class UserController
{
	@Autowired
	private UserService ser;
	@GetMapping("/getbymail/{email}")
	public User getbymail(@PathVariable String email)
	{
		return ser.getObject(email);
	}
}

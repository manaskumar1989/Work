package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.AddressService;
import com.example.demo.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class TestController {

	@Autowired
	UserService userService;

	@Autowired
	AddressService addressService;

	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	public ArrayList<User> getImagePath() {
		ArrayList<User> users = (ArrayList<User>) userService.getAllUser();
		return users;
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public Boolean createUser(@RequestBody User user) {
		boolean res = addressService.addUser(user);
		return res;
	}
}

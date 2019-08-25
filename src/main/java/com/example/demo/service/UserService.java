package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {

	@Autowired UserRepo userRepo;

	public List<User> getAllUser() {

		List<User> users = userRepo.getAllUser();
		return users;
	}

	public boolean createUser(User user) {

		userRepo.save(user);
		return true;
	}
}

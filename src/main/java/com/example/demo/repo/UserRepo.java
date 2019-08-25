package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.User;

public interface UserRepo extends CrudRepository<User, Integer> {

	@Query("from User")
	public List<User> getAllUser();
}

package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Address;

public interface AddressRepo extends CrudRepository<Address, Integer> {

	@Query("from Address")
	public List<Address> getAllAddress();
}

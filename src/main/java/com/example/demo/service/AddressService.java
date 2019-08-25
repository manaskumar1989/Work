package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.entity.User;
import com.example.demo.repo.AddressRepo;
import com.example.demo.repo.UserRepo;


@Service
public class AddressService {

	@Autowired
	AddressRepo addressRepo;
	@Autowired
	AddressRepo addressSerice;

	@Autowired
	UserRepo repo;
	public List<Address> getAllAddress(){
		List<Address> addressList = new ArrayList<>();
		addressList = addressRepo.getAllAddress();
		return addressList;
		
	}

	public boolean saveddress(int userId, List<Address> address) {

		for (Address ad : address) {
			ad.setUserId(userId);
		}
		addressSerice.saveAll(address);
		return true;
	}
	public boolean addUser(User user) {

		List<Address> address = user.getAddresses();
		user.setAddresses(new ArrayList<Address>());
		user = repo.save(user);
		saveddress(user.getUserId(), address);
		return true;
	}
}

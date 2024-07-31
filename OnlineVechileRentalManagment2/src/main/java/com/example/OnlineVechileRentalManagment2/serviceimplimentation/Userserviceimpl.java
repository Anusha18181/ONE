package com.example.OnlineVechileRentalManagment2.serviceimplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineVechileRentalManagment2.entity.User;
import com.example.OnlineVechileRentalManagment2.repository.Userrepository;
import com.example.OnlineVechileRentalManagment2.service.Userservice;

@Service
public class Userserviceimpl implements Userservice {
	@Autowired
	private Userrepository userrepository;

	@Override
	public User addUser(User user) {
		User user2 = userrepository.save(user);
		return user2;
	}

	@Override
	public User updateUser(String userid, User user) throws Exception {
		User user2 = userrepository.findById(userid)
				.orElseThrow(() -> new Exception("User not found with id: " + userid));
		user2.setPassword(user2.getPassword());
		user2.setUserId(user2.getUserId());
		user2.setRole(user2.getRole());
		User user3 = userrepository.save(user);
		return user3;

	}

	@Override
	public User getUser(String userid, User user) throws Exception {
		User user2 = userrepository.findById(userid)
				.orElseThrow(() -> new Exception("User not found with id: " + userid));
		return user2;
	}

	@Override
	public String deleteUser(String userid, User user) throws Exception {
		User user2 = userrepository.findById(userid).orElseThrow(() -> new Exception("Student Id is not present..!!!"));
		userrepository.delete(user2);
		return "Student Deleted Succesfully....!!!";

	}

}

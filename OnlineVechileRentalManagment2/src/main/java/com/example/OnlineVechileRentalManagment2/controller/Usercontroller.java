package com.example.OnlineVechileRentalManagment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineVechileRentalManagment2.entity.User;
import com.example.OnlineVechileRentalManagment2.service.Userservice;
@RestController

public class Usercontroller {
	@Autowired
	private Userservice userservice;

	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		User addUser = userservice.addUser(user);
		return new ResponseEntity<>(addUser, HttpStatus.OK);
	}

	@PutMapping("/updateuser/{userid}")
	ResponseEntity<User> updateUser(@PathVariable String userid, @RequestBody User user) throws Exception {
		User updateUser = userservice.updateUser(userid, user);
		return new ResponseEntity<>(updateUser, HttpStatus.ACCEPTED);
	}

	@GetMapping("/getuser/{userid}")
	ResponseEntity<User> getUser(@PathVariable String userid, @RequestBody User user) throws Exception {
		User getUser = userservice.getUser(userid, user);
		return new ResponseEntity<>(getUser, HttpStatus.ACCEPTED);
	}

	// @DeleteMapping("/users/{userid}")
	@DeleteMapping("/users/{userid}")
	public ResponseEntity<String> deleteUser(@PathVariable String userid, @RequestBody User user) throws Exception {
		String deleteResult = userservice.deleteUser(userid, user);
		return new ResponseEntity<>(deleteResult, HttpStatus.ACCEPTED);
	}

}

package com.example.OnlineVechileRentalManagment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineVechileRentalManagment2.entity.Vechile;
import com.example.OnlineVechileRentalManagment2.service.Vechileservice;

@RestController

public class Vechilecontroller {
	@Autowired
	private Vechileservice vechileservice;

	@PostMapping("/addVechile/{driverid}")
	public ResponseEntity<Vechile> addVechile(@PathVariable int driverid, @RequestBody Vechile vechile) throws Exception {
		
			Vechile addedVechile = vechileservice.add(driverid, vechile);
			return new ResponseEntity<Vechile>(addedVechile, HttpStatus.OK);
		
	

}
}

package com.example.OnlineVechileRentalManagment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineVechileRentalManagment2.entity.Driver;
import com.example.OnlineVechileRentalManagment2.service.Diverservice;

@RestController

public class Drivercontroller {
	@Autowired
	private Diverservice driverservice;

	@PostMapping("/adddriver")
	public ResponseEntity<Driver> addCustomer(@RequestBody Driver driver) {
		Driver addDriver = driverservice.add(driver);
		return new ResponseEntity<>(addDriver, HttpStatus.OK);
	}

	public ResponseEntity<Driver> updateDriver(@PathVariable int driverid, @RequestBody Driver driver)
			throws Exception {

		Driver updatDriver = driverservice.update(driverid, driver);
		return new ResponseEntity<>(updatDriver, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{driverid}")
	public ResponseEntity<String> deleteStudent(@PathVariable int DriverId) throws Exception {
		String deleteDriver = driverservice.delete(DriverId);
		return new ResponseEntity<>(deleteDriver, HttpStatus.ACCEPTED);

	}
}

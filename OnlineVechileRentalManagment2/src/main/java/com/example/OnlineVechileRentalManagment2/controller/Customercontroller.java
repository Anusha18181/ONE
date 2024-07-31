package com.example.OnlineVechileRentalManagment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineVechileRentalManagment2.entity.Customer;
import com.example.OnlineVechileRentalManagment2.service.Customerservice;

@RestController
public class Customercontroller {
	@Autowired
	private Customerservice customerservice;

	@PostMapping("/addcustomer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		Customer addCustomer = customerservice.addCustomer(customer);
		return new ResponseEntity<>(addCustomer, HttpStatus.OK);
	}

	@PutMapping("/update/{Customerid}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable int customerid, @RequestBody Customer customer)
			throws Exception {
		Customer updateStudent = customerservice.updateCustomer(customerid, customer);
		return new ResponseEntity<>(updateStudent, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{Customerid}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int studentId) throws Exception {
		String deleteStudent = customerservice.delete(studentId);
		return new ResponseEntity<>(deleteStudent, HttpStatus.ACCEPTED);
	}

}
package com.example.OnlineVechileRentalManagment2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineVechileRentalManagment2.entity.Payment;
import com.example.OnlineVechileRentalManagment2.service.Paymentservice;

@RestController

public class Paymentcontroller {
	@Autowired
	private Paymentservice paymentservice;

	@PostMapping("/addpayment/{bookingid}")
	public ResponseEntity<Payment> addPayment(@PathVariable String bookingid, @RequestBody Payment payment) throws Exception {
        Payment addedPayment = paymentservice.add(bookingid, payment);
		return new ResponseEntity<Payment>(addedPayment, HttpStatus.OK);
	}
}

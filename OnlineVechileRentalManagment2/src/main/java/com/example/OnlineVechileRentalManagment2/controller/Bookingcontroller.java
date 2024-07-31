package com.example.OnlineVechileRentalManagment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineVechileRentalManagment2.entity.Booking;
import com.example.OnlineVechileRentalManagment2.service.Bookingservice;

@RestController
public class Bookingcontroller {
	@Autowired
	private Bookingservice bookingservice;

	@PostMapping("/addBooking")
	public ResponseEntity<Booking> addBooking(@RequestBody Booking booking, @RequestParam int vehicleId, @RequestParam int customerId) throws Exception {
		Booking addBooking = bookingservice.add(booking,vehicleId,customerId );
		return new ResponseEntity<Booking>(addBooking, HttpStatus.OK);
	}

	@PutMapping("/updateBooking/{bookingid}")
	public ResponseEntity<Booking> updateBooking(@RequestParam String bookingid, @RequestBody Booking booking)
			throws Exception {
		Booking updateBooking = bookingservice.update(bookingid, booking);
		return new ResponseEntity<>(updateBooking, HttpStatus.ACCEPTED);

	}

}

package com.example.OnlineVechileRentalManagment2.serviceimplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineVechileRentalManagment2.entity.Booking;
import com.example.OnlineVechileRentalManagment2.entity.Customer;
import com.example.OnlineVechileRentalManagment2.entity.Vechile;
import com.example.OnlineVechileRentalManagment2.repository.Bookingrepository;
import com.example.OnlineVechileRentalManagment2.repository.Customerrepository;
import com.example.OnlineVechileRentalManagment2.repository.Vechilerepository;
import com.example.OnlineVechileRentalManagment2.service.Bookingservice;

@Service
public class Bookingserviceimpl2 implements Bookingservice {
	@Autowired
	private Bookingrepository bookingrepository;
	@Autowired
	private Customerrepository customerrepository;
	@Autowired
	private Vechilerepository vechilerepository;

	@Override
	public Booking add(Booking booking, int vechileid, int customerid) throws Exception {

		Customer customer = customerrepository.findById(customerid)
				.orElseThrow(() -> new Exception("Customer not found with id: " + customerid));
		Vechile vechile = vechilerepository.findById(vechileid)
				.orElseThrow(() -> new Exception("Vechile not found with id: " + vechileid));

		booking.setCustomer(customer);
		booking.setVechile(vechile);

		return bookingrepository.save(booking);
	}

	@Override
	public Booking update(String bookigid, Booking booking) throws Exception {
		Booking existingBooking = bookingrepository.findById(bookigid)
				.orElseThrow(() -> new Exception("Bookingid Id is not present..!!!"));

		existingBooking.setBookingdatefromdate(booking.getBookingdatefromdate());
		existingBooking.setBookingdatetilldate(booking.getBookingdatetilldate());
		existingBooking.setBookingdescription(booking.getBookingdescription());
		existingBooking.setCustomer(booking.getCustomer());
		existingBooking.setDistance(booking.getDistance());
		existingBooking.setTotalCost(booking.getTotalCost());
		existingBooking.setVechile(booking.getVechile());

		Booking booking3 = bookingrepository.save(existingBooking);
		return booking3;
	}

	@Override
	public Booking get(String bookingid, Booking booking) throws Exception {
		Booking booking2 = bookingrepository.findById(bookingid)
				.orElseThrow(() -> new Exception("Admin Id is not present..!!!"));
		return booking2;
	}

	@Override
	public String delete(String bookingid, Booking booking) throws Exception {
		Booking booking2 = bookingrepository.findById(bookingid)
				.orElseThrow(() -> new Exception("Bookingid Id is not present..!!!"));
		bookingrepository.delete(booking2);

		return "Delete the booking";
	}

}

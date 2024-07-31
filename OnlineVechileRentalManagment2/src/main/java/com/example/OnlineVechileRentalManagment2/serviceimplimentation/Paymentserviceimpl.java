package com.example.OnlineVechileRentalManagment2.serviceimplimentation;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineVechileRentalManagment2.entity.Booking;
import com.example.OnlineVechileRentalManagment2.entity.Payment;
import com.example.OnlineVechileRentalManagment2.repository.Bookingrepository;
import com.example.OnlineVechileRentalManagment2.repository.Paymentrepository;
import com.example.OnlineVechileRentalManagment2.service.Paymentservice;

@Service
public class Paymentserviceimpl implements Paymentservice {
	@Autowired
	private Bookingrepository bookingrepository;
	@Autowired
	private Paymentrepository paymentrepository;

	@Override
	public Payment get(int payment) throws Exception {
		Payment payment2 = paymentrepository.findById(payment)
				.orElseThrow(() -> new Exception("payment Id is not present..!!!"));
		return payment2;

	}

	@Override
	public String delete(int paymentid) throws Exception {
		Payment payment2 = paymentrepository.findById(paymentid)
				.orElseThrow(() -> new Exception("paymentid Id is not present..!!!"));
		paymentrepository.delete(payment2);
		return "Delete the paymenmtid";

	}

	@Override
	public Payment update(int paymentid, Payment payment) throws Exception {
		Payment payment2 = paymentrepository.findById(paymentid)
				.orElseThrow(() -> new Exception("paymentid Id is not present..!!!"));
		payment2.setPaymentmode(payment.getPaymentmode());
		payment2.setPaymentstatus(payment.getPaymentstatus());
		Payment payment3 = paymentrepository.save(payment2);
		return payment3;
	}

	@Override
	public Payment add(String bookingId, Payment payment) throws Exception {
		
		Booking booking = bookingrepository.findById(bookingId).orElseThrow(()-> new Exception("Exception"));
		payment.setLocalDate(LocalDate.now());
		payment.setBooking(booking);
		return paymentrepository.save(payment);
		



	}

}

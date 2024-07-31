package com.example.OnlineVechileRentalManagment2.service;

import com.example.OnlineVechileRentalManagment2.entity.Payment;

public interface Paymentservice {
	

	public Payment update(int paymentid,Payment payment) throws Exception;

	public Payment get(int payment) throws Exception;

	public String delete(int paymentid) throws Exception;

	Payment add(String bookingId, Payment payment) throws Exception;

}
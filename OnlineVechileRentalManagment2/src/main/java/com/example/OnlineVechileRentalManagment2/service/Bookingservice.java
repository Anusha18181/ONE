package com.example.OnlineVechileRentalManagment2.service;

import com.example.OnlineVechileRentalManagment2.entity.Booking;

public interface Bookingservice {
	Booking add(Booking booking, int vechileid, int customerid) throws Exception;

	public Booking update(String bookigid, Booking booking)throws Exception;

	public Booking get(String bookingid,Booking booking)throws Exception;

	public String delete(String bookingid, Booking booking) throws Exception;

	

	

	

	
}

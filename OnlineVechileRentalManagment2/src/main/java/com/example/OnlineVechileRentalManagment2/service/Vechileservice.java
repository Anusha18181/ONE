package com.example.OnlineVechileRentalManagment2.service;

import com.example.OnlineVechileRentalManagment2.entity.Vechile;

public interface Vechileservice {
	public Vechile add(int driverid ,Vechile vechile) throws Exception;
	public Vechile update(int vechileid,Vechile vechile) throws Exception;
	public Vechile get(int vechileid) throws Exception;

}

package com.example.OnlineVechileRentalManagment2.service;

import org.springframework.stereotype.Service;

import com.example.OnlineVechileRentalManagment2.entity.Driver;
@Service
public interface Diverservice {
	public Driver add(Driver driver);

	public Driver update(int Driverid ,Driver  driver) throws Exception;

	public Driver get(int Driverid) throws Exception;

	public String delete(int Driverid) throws Exception;
}

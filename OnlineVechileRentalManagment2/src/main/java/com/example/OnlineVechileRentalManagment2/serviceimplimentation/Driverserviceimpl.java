package com.example.OnlineVechileRentalManagment2.serviceimplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineVechileRentalManagment2.entity.Driver;
import com.example.OnlineVechileRentalManagment2.repository.Driverrepository;
import com.example.OnlineVechileRentalManagment2.service.Diverservice;

@Service
public class Driverserviceimpl implements Diverservice {
	@Autowired
	private Driverrepository driverrepository;

	@Override
	public Driver add(Driver driver) {
		Driver driver2 = driverrepository.save(driver);
		return driver2;
	}

	@Override
	public Driver get(int Driverid) throws Exception {
		Driver driver2 = driverrepository.findById(Driverid)
				.orElseThrow(() -> new Exception("Driverid Id is not present..!!!"));
		return driver2;
	}

	@Override
	public String delete(int Driverid) throws Exception {
		Driver driver2 = driverrepository.findById(Driverid)
				.orElseThrow(() -> new Exception("Student Id is not present..!!!"));
		driverrepository.delete(driver2);
		return "Student Deleted Succesfully....!!!";
	}

	@Override
	public Driver update(int Driverid, Driver driver) throws Exception {
		Driver driver2 = driverrepository.findById(Driverid)
				.orElseThrow(() -> new Exception("Driverid Id is not present..!!!"));
		driver2.setDriverid(driver2.getDriverid());
		driver2.setAddress(driver2.getAddress());
		driver2.setEmailid(driver2.getEmailid());
		driver2.setFirstname(driver2.getFirstname());
		driver2.setLastname(driver2.getLastname());
		driver2.setLicencenumber(driver2.getLicencenumber());
		Driver driver3 = driverrepository.save(driver);
		return driver3;
	}
}
package com.example.OnlineVechileRentalManagment2.serviceimplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineVechileRentalManagment2.entity.Driver;
import com.example.OnlineVechileRentalManagment2.entity.Vechile;
import com.example.OnlineVechileRentalManagment2.repository.Driverrepository;
import com.example.OnlineVechileRentalManagment2.repository.Vechilerepository;
import com.example.OnlineVechileRentalManagment2.service.Vechileservice;

@Service
public class Vechileserviceimpl implements Vechileservice {
	@Autowired
	private Driverrepository driverrepository;
	@Autowired
	private Vechilerepository vechilerepository;

	@Override
	public Vechile add(int driverid, Vechile vechile) throws Exception {
		Driver driver = driverrepository.findById(driverid)
				.orElseThrow(() -> new Exception("Customer not found with id: " + driverid));
		vechile.setDriver(driver);
		return vechilerepository.save(vechile);

	}

	@Override
	public Vechile update(int vechileid, Vechile vechile) throws Exception {
		Vechile existingVechile = vechilerepository.findById(vechileid)
				.orElseThrow(() -> new Exception("Vechile not found with id: " + vechileid));

		existingVechile.setCapacity(vechile.getCapacity());
		existingVechile.setCategory(vechile.getCategory());
		existingVechile.setChargesperkm(vechile.getChargesperkm());
		existingVechile.setDescription(vechile.getDescription());
		existingVechile.setFixedcharges(vechile.getFixedcharges());
		existingVechile.setLocation(vechile.getLocation());
		existingVechile.setType(vechile.getType());
		existingVechile.setVechileNumber(vechile.getVechileNumber());

		Vechile vechile3= vechilerepository.save(existingVechile);
		return vechile3;
	}

	@Override
	public Vechile get(int vechileid) throws Exception {

		Vechile vechile2 = vechilerepository.findById(vechileid)
				.orElseThrow(() -> new Exception("Vechile  not present"));
		return vechile2;

	}
}

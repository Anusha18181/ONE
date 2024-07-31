package com.example.OnlineVechileRentalManagment2.serviceimplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineVechileRentalManagment2.entity.Customer;
import com.example.OnlineVechileRentalManagment2.repository.Customerrepository;

import com.example.OnlineVechileRentalManagment2.service.Customerservice;

@Service
public class Customeriserviceimpl implements Customerservice {
	@Autowired
	private Customerrepository customerrepository;

	@Override
	public Customer addCustomer(Customer customer) {
		Customer customer2 = customerrepository.save(customer);
		return customer2;
	}

	@Override
	public String delete(int customerid) throws Exception {
		Customer customer2 = customerrepository.findById(customerid)
				.orElseThrow(() -> new Exception("Admin Id is not present..!!!"));
		customerrepository.delete(customer2);
		return "Customer Deleted Succesfully....!!!";
	}

	@Override
	public Customer updateCustomer(int customerid, Customer customer) throws Exception {
		Customer customer2 = customerrepository.findById(customerid).orElseThrow(() -> new Exception("Admin Id is not present..!!!"));
		customer2.setAddress(customer2.getAddress());
		customer2.setEmailid(customer2.getEmailid());
		customer2.setFirstname(customer2.getFirstname());
		customer2.setLastname(customer2.getLastname());
		customer2.setMobilenumber(customer2.getMobilenumber());
		customer2.setPassword(customer2.getPassword());
		customer2.setUserid(customer2.getUserid());
		customer2.setRole(customer2.getRole());
		Customer customer3 = customerrepository.save(customer2);
		return customer3;

	}

}

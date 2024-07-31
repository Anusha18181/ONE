package com.example.OnlineVechileRentalManagment2.service;

import org.springframework.stereotype.Service;

import com.example.OnlineVechileRentalManagment2.entity.Customer;
@Service
public interface Customerservice {
	public Customer addCustomer(Customer customer);

	public String delete(int customerid) throws Exception;

	public Customer updateCustomer(int customerid, Customer customer) throws Exception;
	
}
	

	


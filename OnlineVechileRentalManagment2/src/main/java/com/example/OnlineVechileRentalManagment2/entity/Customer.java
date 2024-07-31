package com.example.OnlineVechileRentalManagment2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
	@Id

	private int customerid;
	private String firstname;
	private String lastname;
	private String emailid;
	private String mobilenumber;
	private String address;
	private String userid;
	private String password;
	private String role;
}
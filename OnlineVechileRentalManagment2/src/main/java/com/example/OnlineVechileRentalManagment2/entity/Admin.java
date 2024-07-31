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
public class Admin  {
	@Id
	 
	private int adminid;
	private int adminpassword;
	private String userid;
	private String password;
	private String role;
}
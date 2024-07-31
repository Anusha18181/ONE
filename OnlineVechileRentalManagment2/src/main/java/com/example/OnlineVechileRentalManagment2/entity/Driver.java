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
public class Driver {
	@Id

	private int driverid;
	private String firstname;
	private String lastname;
	private String address;
	private String mobilenumber;
	private String emailid;
	private String licencenumber;

}

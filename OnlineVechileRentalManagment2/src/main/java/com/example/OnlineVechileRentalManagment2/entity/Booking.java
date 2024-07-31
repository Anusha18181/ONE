package com.example.OnlineVechileRentalManagment2.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
	@Id
	private String bookingid;
	private Date bookingdatefromdate;
	private Date bookingdatetilldate;
	private String bookingdescription;
	private double totalCost;
	private double perdaycost;
	private double distance;
	@OneToOne
	private Customer customer;
	@OneToOne
	private Vechile vechile;

}
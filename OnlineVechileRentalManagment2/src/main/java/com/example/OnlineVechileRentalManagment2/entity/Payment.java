package com.example.OnlineVechileRentalManagment2.entity;


import java.time.LocalDate;

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
public class Payment {
	@Id
	private int paymentid;
	private String paymentmode;
	private LocalDate localDate;
	private String paymentstatus;

	@OneToOne
	private Booking booking;
}
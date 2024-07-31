package com.example.OnlineVechileRentalManagment2.entity;

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
public class Vechile {
	@Id
	

	private int vechileid;

	private String vechileNumber;
	private String type;
	private String category;
	private String description;
	private String location;
	private int capacity;
	private double chargesperkm;
	private double fixedcharges;

	@OneToOne
	private Driver driver;

}

package com.example.OnlineVechileRentalManagment2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineVechileRentalManagment2.entity.Payment;
@Repository
public interface Paymentrepository extends JpaRepository<Payment,Integer> {

}

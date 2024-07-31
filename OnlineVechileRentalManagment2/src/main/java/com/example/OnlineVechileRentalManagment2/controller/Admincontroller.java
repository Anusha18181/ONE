package com.example.OnlineVechileRentalManagment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineVechileRentalManagment2.entity.Admin;
import com.example.OnlineVechileRentalManagment2.service.Adminservice;

@RestController
public class Admincontroller {
	@Autowired
	private Adminservice adminservice;

	@PostMapping("/addadmin")
	public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
		Admin addAdmin = adminservice.addAdmin(admin);
		return new ResponseEntity<>(addAdmin, HttpStatus.OK);
	}
@PutMapping("/updateadmin/{adminid}")
	public ResponseEntity<Admin> updateAdmin(@PathVariable int adminid,@RequestBody Admin admin) throws Exception{
		Admin updateAdmin = adminservice.updateAdmin(adminid, admin);
		return new ResponseEntity<>(updateAdmin,HttpStatus.ACCEPTED);
}
@GetMapping("/getadmin/{adminid}")
ResponseEntity<Admin> getAdmin(@PathVariable int adminid, @RequestBody Admin admin) throws Exception {
	return new ResponseEntity<>(admin, HttpStatus.ACCEPTED);
}
@DeleteMapping ("/deleteadmin/{adminid}")
ResponseEntity<Admin>deleteAdmin(@PathVariable int adminid, @RequestBody Admin admin)throws Exception{
	return new ResponseEntity<>(admin,HttpStatus.ACCEPTED);
}
}


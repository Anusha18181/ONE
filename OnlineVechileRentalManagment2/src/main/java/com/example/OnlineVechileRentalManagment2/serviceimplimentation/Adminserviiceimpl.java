package com.example.OnlineVechileRentalManagment2.serviceimplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineVechileRentalManagment2.entity.Admin;
import com.example.OnlineVechileRentalManagment2.repository.Adminrepository;
import com.example.OnlineVechileRentalManagment2.service.Adminservice;

@Service
public class Adminserviiceimpl implements Adminservice {
	@Autowired
	private Adminrepository adminrepository;

	@Override
	public Admin addAdmin(Admin admin) {
		Admin admin2 = adminrepository.save(admin);
		return admin2;
	}
	
	
	
	
	@Override
	public Admin updateAdmin(int adminid, Admin admin)throws Exception {
		Admin existingAdmin = adminrepository.findById(adminid)
				.orElseThrow(() -> new Exception("Admin Id is not present..!!!"));

		existingAdmin.setPassword(admin.getPassword());
		existingAdmin.setUserid(admin.getUserid());
		existingAdmin.setAdminpassword(admin.getAdminpassword());
		existingAdmin.setRole(admin.getRole());

		Admin updatedAdmin = adminrepository.save(existingAdmin);

		return updatedAdmin;

	}

	@Override
	public Admin getAdmin(int Adminid) throws Exception {
		Admin admin2 = adminrepository.findById(Adminid)
				.orElseThrow(() -> new Exception("Admin Id is not present..!!!"));
		return admin2;
	}

	@Override
	public String delete(int Adminid, Admin admin) throws Exception {
		Admin admin2 = adminrepository.findById(Adminid)
				.orElseThrow(() -> new Exception("Student Id is not present..!!!"));
		adminrepository.delete(admin2);
		return "Admin Deleted Succesfully....!!!";
	}

}

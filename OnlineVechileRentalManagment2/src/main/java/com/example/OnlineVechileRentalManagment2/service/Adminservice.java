package com.example.OnlineVechileRentalManagment2.service;

import com.example.OnlineVechileRentalManagment2.entity.Admin;

public interface Adminservice {
	public Admin addAdmin(Admin admin);

	public Admin getAdmin(int Adminid) throws Exception;

	public String delete(int Adminid,Admin admin) throws Exception;

	public Admin updateAdmin(int adminid, Admin admin) throws Exception;

	

}

package com.example.OnlineVechileRentalManagment2.service;

import com.example.OnlineVechileRentalManagment2.entity.User;

public interface Userservice {

	public User addUser(User user);

	public User updateUser(String userid, User user) throws Exception;

	public User getUser(String userid, User user) throws Exception;

	public String deleteUser(String userid, User user) throws Exception;

}

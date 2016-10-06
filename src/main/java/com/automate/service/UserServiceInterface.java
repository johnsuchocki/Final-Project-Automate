package com.automate.service;

import java.util.List;

import com.automate.model.User;

public interface UserServiceInterface {
	
	List<User> getAllUsers();
	User getUserById(int userId);
	User getUserTestById(int userId);
	boolean addUser(User user);
	void updateUser(User user);
	void deleteUser(int userId);
	public List<User> getMatches(String homeLat, String homeLng);
//	public List<User> getMatches();
	public boolean verifyPassword();

}

package com.KodB.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KodB.entites.User;
import com.KodB.repositories.UserRepository;

@Service
public class UserServiceImplementation 
	implements UserService{
	@Autowired
	UserRepository repo;
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}

	@Override
	public boolean userExists(String username, String email) {
		// TODO Auto-generated method stub
		User user1 =repo.findByUsername(username);
		User user2 =repo.findByEmail(email);
		if(user1 != null || user2 != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
	 String dbPass = repo.findByUsername(username).getPassword();
		if(password.equals(dbPass)) {
			return true;
		}
		return false;
	}
}

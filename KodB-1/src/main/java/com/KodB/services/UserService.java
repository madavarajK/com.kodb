package com.KodB.services;

import com.KodB.entites.User;

public interface UserService {

	boolean userExists(String username, String email);

	void addUser(User user);

	boolean validateUser(String username, String password);

}

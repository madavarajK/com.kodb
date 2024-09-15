package com.KodB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KodB.entites.User;

public interface UserRepository
extends JpaRepository<User, Long>{

	User findByUsername(String username);

	User findByEmail(String email);

}

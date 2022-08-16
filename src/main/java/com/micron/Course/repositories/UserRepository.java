package com.micron.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micron.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}

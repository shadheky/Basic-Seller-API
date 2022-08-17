package com.micron.Course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micron.Course.entities.User;
import com.micron.Course.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long ID) {
		return repository.findById(ID).get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}

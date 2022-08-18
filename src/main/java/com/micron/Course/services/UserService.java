package com.micron.Course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.micron.Course.entities.User;
import com.micron.Course.repositories.UserRepository;
import com.micron.Course.services.exceptions.DataBaseException;
import com.micron.Course.services.exceptions.ResourceNotFoundException;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		
		try {
			repository.deleteById(id);
	} catch(EmptyResultDataAccessException e) {
		throw new ResourceNotFoundException(id);
	}catch(DataIntegrityViolationException e) {
		throw new DataBaseException(e.getMessage());
	}
		}
		
	
	public User update(Long id, User obj) {
		User entity = repository.findById(id).get();
		updateData(entity,obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
}

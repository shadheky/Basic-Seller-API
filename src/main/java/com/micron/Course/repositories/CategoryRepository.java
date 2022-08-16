package com.micron.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micron.Course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
	
}

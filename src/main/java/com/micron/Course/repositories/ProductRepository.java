package com.micron.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micron.Course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	
}

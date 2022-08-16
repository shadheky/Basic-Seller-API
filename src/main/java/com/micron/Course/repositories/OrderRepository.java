package com.micron.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micron.Course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
	
}

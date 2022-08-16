package com.micron.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micron.Course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
	
}

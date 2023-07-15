package com.devmireki.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmireki.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {	
	
}
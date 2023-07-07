package com.devmireki.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmireki.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {	
	
}
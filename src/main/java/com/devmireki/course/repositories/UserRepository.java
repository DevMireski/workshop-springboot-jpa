package com.devmireki.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmireki.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	
	
}
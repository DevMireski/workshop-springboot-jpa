package com.devmireki.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devmireki.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
	User u = new User(1L, "Gustavo", "gustavo@gmail.com", "74246457", "789456"); 
	return ResponseEntity.ok().body(u);
	}
}

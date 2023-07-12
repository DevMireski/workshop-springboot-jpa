package com.devmireki.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmireki.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
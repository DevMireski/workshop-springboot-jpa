package com.devmireki.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmireki.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
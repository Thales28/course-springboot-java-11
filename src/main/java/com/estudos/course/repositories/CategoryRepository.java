package com.estudos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

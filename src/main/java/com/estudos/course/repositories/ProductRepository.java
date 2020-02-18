package com.estudos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

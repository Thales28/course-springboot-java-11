package com.estudos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}

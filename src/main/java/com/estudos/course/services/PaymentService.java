package com.estudos.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.course.entities.Payment;
import com.estudos.course.repositories.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repository;
	
	public List<Payment> findAll(){
		return repository.findAll();
	}
	
	public Payment findById(Long id) {
		Optional<Payment> obj = repository.findById(id);
		return obj.get();
	}
}
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Deposit;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Repository.DepositRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private DepositRepository depositRepository;
	
	public void addUser(Customer customer) {
		Deposit d = customer.getDeposit();
		depositRepository.save(d);
		customerRepository.save(customer);
	}
}
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.DepositRepository;
import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;

@Service
public class DepositService {
	@Autowired
	private DepositRepository depositRepository;
	@Autowired
	private CustomerRepository customerRepository;
	
	public void addDeposit(DepositService deposit, Integer id) {
		
		Customer customer = customerRepository.findById(id).get();
		
		Double old_amt = customer.getDeposit().getAmt();
		Double final_amt = old_amt + deposit.getAmt();
		
		Deposit _deposit = customer.getDeposit();
		_deposit.setAmt(final_amt);
		depositRepository.save(_deposit);
		
		customer.setDeposit(_deposit);
		CustomerRepository.save(customer);
		
	}

}
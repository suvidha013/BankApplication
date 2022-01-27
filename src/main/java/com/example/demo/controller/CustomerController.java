package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Service.CustomerService;


@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customer")
	
	
	@Transactional
	@ResponseStatus(code = HttpsStatus.CREATED)
	void addCustomer(@RequestBody Customer customer) {
		CustomerService.addUser(customer);
	}
}

package com.example.demo.Repository;

import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	Object findById(Integer id);

	
}
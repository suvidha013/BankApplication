package com.example.demo.Repository;


import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Deposit;

@Repository
public interface DepositRepository extends CrudRepository<Deposit, Integer> {
}
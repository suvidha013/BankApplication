package com.example.demo.Repository;

import com.example.demo.Enity.Account;
import com.example.demo.controller.RestController;

@RestController
public interface AccountRepository extends CrudRepository<Account,Integer>{

}

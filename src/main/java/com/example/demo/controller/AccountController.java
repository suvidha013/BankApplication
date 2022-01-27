package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Enity.Account;
import com.example.demo.Service.AccountService;

public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/{id}/account")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addAccount(@RequestBody @Valid Account account, @PathVariable("id") Integer id) {
		accountService.addAccount(account, id);
}

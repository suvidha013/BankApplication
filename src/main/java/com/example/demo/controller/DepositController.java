package com.example.demo.controller;

import com.example.demo.Entity.Deposit;

@RestController
public class DepositController<depositService> {
	
	@Autowired
	private DepositService depositService;
	
	@PostMapping("/{id}/deposit")
	@Transactional
	@ResponseStatus(code = HttpStatus.CREATED)
	void addDeposit(@RequestBody @Valid Deposit deposit, @PathVariable("id") Integer id) {
		depositService.addDeposit(deposit, id);
	}
}
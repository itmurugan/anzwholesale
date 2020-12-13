package com.anz.wholesale.customer.account.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anz.wholesale.customer.account.Account;
import com.anz.wholesale.customer.account.exeception.AccountNotFoundException;
import com.anz.wholesale.customer.account.exeception.CustomerNotFoundException;
import com.anz.wholesale.customer.account.jpa.repo.AccountRepository;
import com.anz.wholesale.customer.account.transaction.view.model.AccountTransactions;

@RestController
public class AccountController {
	@Autowired
	private AccountRepository accountRepository;

	@GetMapping(path = "/customers/{customerId}/accounts")
	public List<Account> getAccounts(@PathVariable int customerId) {

		List<Account> accountList = accountRepository.findByCustomer(customerId);
		
		if(accountList.isEmpty()) {
			throw new CustomerNotFoundException("Customer not found");
		}

		return accountList;
	}

	@GetMapping(path = "/accounts/{accountId}/transactions")
	public AccountTransactions getAccountTransactions(@PathVariable int accountId) {

		Optional<Account> accountOptional = accountRepository.findById(accountId);
		
		if(!accountOptional.isPresent()) {
			throw new AccountNotFoundException("Account not found");
		}
		
		AccountTransactions accountTransactions = new AccountTransactions();
		accountTransactions.setAccountNo(accountOptional.get().getAccountNo());
		accountTransactions.setAcocuntName(accountOptional.get().getAccountName());
		accountTransactions.setTractionsList(accountOptional.get().getAccountTransaction());
		
		return accountTransactions;
	}

}

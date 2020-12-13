package com.anz.wholesale.customer.account.transaction.view.model;

import java.util.List;

import com.anz.wholesale.customer.account.transaction.Transaction;

public class AccountTransactions {
	private int accountNo;
	
	private String acocuntName;
	
	private List<Transaction> tractionsList;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAcocuntName() {
		return acocuntName;
	}

	public void setAcocuntName(String acocuntName) {
		this.acocuntName = acocuntName;
	}

	public List<Transaction> getTractionsList() {
		return tractionsList;
	}

	public void setTractionsList(List<Transaction> tractionsList) {
		this.tractionsList = tractionsList;
	}
}

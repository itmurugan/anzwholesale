package com.anz.wholesale.customer.account;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.anz.wholesale.customer.account.transaction.Transaction;
import com.anz.wholesale.util.MoneySerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Holds account information
 * 
 * @author Murugan Velsamy Date - 9-Dec-2020
 *
 */
@Entity
public class Account {
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Integer accountNo, int customerId, String accountName, String accountType, Date balanceDate,
			String currency, BigDecimal openingAvailbleBalance) {
		super();
		this.accountNo = accountNo;
		this.customerId = customerId;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currency = currency;
		this.openingAvailbleBalance = openingAvailbleBalance;
	}

	@Id
	@GeneratedValue
	private Integer accountNo;
	
	@OneToMany(mappedBy = "account")
	@JsonIgnore
	private List<Transaction> accountTransaction; 

	@JsonIgnore
	private int customerId;
	
	private String accountName;

	private String accountType;

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date balanceDate;

	private String currency;
	
	//To-do format number
	@JsonSerialize(using = MoneySerializer.class)
    private BigDecimal openingAvailbleBalance;

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getOpeningAvailbleBalance() {
		return openingAvailbleBalance;
		
	}

	public void setOpeningAvailbleBalance(BigDecimal openingAvailbleBalance) {
		this.openingAvailbleBalance = openingAvailbleBalance;
	}

	public List<Transaction> getAccountTransaction() {
		return accountTransaction;
	}

	public void setAccountTransaction(List<Transaction> accountTransaction) {
		this.accountTransaction = accountTransaction;
	}

}

package com.anz.wholesale.customer.account.transaction;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.anz.wholesale.customer.account.Account;
import com.anz.wholesale.util.MoneySerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
public class Transaction {
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(Date valueDate, String currency, BigDecimal debitAmount, BigDecimal creditAmount,
			String transactionType, String transactionNarrative) {
		super();
		this.valueDate = valueDate;
		this.currency = currency;
		this.debitAmount = debitAmount;
		this.creditAmount = creditAmount;
		this.transactionType = transactionType;
		this.transactionNarrative = transactionNarrative;
	}
	
	@Id
	@GeneratedValue
	@JsonIgnore
	private Integer id;
	
	@JsonIgnore
	@ManyToOne (fetch=FetchType.LAZY)
	private Account account;
	
	@JsonFormat(pattern="MMM, dd, yyyy")
	private Date valueDate;

	private String currency;
	
	@JsonSerialize(using = MoneySerializer.class)
	private BigDecimal debitAmount;
	@JsonSerialize(using = MoneySerializer.class)
	private BigDecimal creditAmount;
	private String transactionType;
	private String transactionNarrative;
	
	
	public Date getValueDate() {
		return valueDate;
	}
	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public BigDecimal getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(BigDecimal debitAmount) {
		this.debitAmount = debitAmount;
	}
	public BigDecimal getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionNarrative() {
		return transactionNarrative;
	}
	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

	
}

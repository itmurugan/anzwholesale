package com.anz.wholesale.customer.account.exeception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends ResourceNotFoundException {

	public CustomerNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}

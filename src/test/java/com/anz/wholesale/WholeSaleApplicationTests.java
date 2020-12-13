package com.anz.wholesale;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.anz.wholesale.customer.account.controller.AccountController;

@SpringBootTest
class WholeSaleApplicationTests {
	
	@Autowired
	AccountController accountController;

	
	@Test
	void contextLoads() {
		assertThat(accountController).isNotNull();
	}

}

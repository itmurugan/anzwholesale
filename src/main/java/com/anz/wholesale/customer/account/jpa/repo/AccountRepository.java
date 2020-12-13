package com.anz.wholesale.customer.account.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anz.wholesale.customer.account.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

	@Query("SELECT account FROM Account account where account.customerId = :customerId")
	List<Account> findByCustomer(int customerId);

}

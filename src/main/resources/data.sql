-- create table account (account_no integer not null, account_name varchar(255), account_type varchar(255), balance_date timestamp, currency varchar(255), customer_id integer not null, opening_availble_balance decimal(19,2), primary key (account_no))
-- customer 1
insert into account values (100, 'My SGD account', 'current', sysdate(), 'SGD', 1, 1232323320.00);
insert into account values (101, 'My USD account', 'current', sysdate(), 'USD', 1, 100.030);
insert into account values (102, 'My Savings account', 'Savings', sysdate(), 'SGD', 1, 1321300.00);
insert into account values (103, 'My loan account', 'current', sysdate(), 'SGD', 1, 100.00);

-- customer 2
insert into account values (200, 'My SGD account', 'current', sysdate(), 'SGD', 2, 120.00);
insert into account values (201, 'My USD account', 'current', sysdate(), 'USD', 2, 100.00);
insert into account values (202, 'My Savings account', 'Savings', sysdate(), 'SGD', 2, 100.00);
insert into account values (203, 'My loan account', 'current', sysdate(), 'SGD', 2, 100.00);

-- customer 3
insert into account values (300, 'My SGD account', 'current', sysdate(), 'SGD', 3, 120.00);
insert into account values (301, 'My USD account', 'current', sysdate(), 'USD', 3, 100.00);
insert into account values (302, 'My Savings account', 'Savings', sysdate(), 'SGD', 3, 100.00);
insert into account values (303, 'My loan account', 'current', sysdate(), 'SGD', 3, 100.00);


--ID  	CREDIT_AMOUNT  	CURRENCY  	DEBIT_AMOUNT  	TRANSACTION_NARRATIVE  	TRANSACTION_TYPE  	VALUE_DATE  	ACCOUNT_ACCOUNT_NO
--post in to account 100  
insert into transaction values (1001, 10, 'SGD', 0, 'testing transaction', 'credit',sysdate(),100);
insert into transaction values (1002, 20.00, 'SGD', 0, 'transaction 2', 'credit',sysdate(),100);
insert into transaction values (1003, 30, 'SGD', 0, 'testing transaction 3', 'credit',sysdate(),100);
insert into transaction values (1004, 40.55, 'SGD', 0, '4 - transfer', 'credit',sysdate(),100);
insert into transaction values (1005, 1023, 'SGD', 0, ' ', 'credit',sysdate(),100);
insert into transaction values (1006, 101, 'SGD', 0, 'trans 5', 'credit',sysdate(),100);

--ID  	CREDIT_AMOUNT  	CURRENCY  	DEBIT_AMOUNT  	TRANSACTION_NARRATIVE  	TRANSACTION_TYPE  	VALUE_DATE  	ACCOUNT_ACCOUNT_NO
--post in to account 101
insert into transaction values (1007, 10, 'SGD', 0, 'testing transaction', 'credit',sysdate(),101);
insert into transaction values (1008, 20.00, 'SGD', 0, 'transaction 2', 'credit',sysdate(),101);
insert into transaction values (1009, 30, 'SGD', 0, 'testing transaction 3', 'credit',sysdate(),101);
insert into transaction values (1010, 40.55, 'SGD', 0, '4 - transfer', 'credit',sysdate(),101);
insert into transaction values (1011, 1023, 'SGD', 0, ' ', 'credit',sysdate(),101);
insert into transaction values (1012, 101, 'SGD', 0, 'trans 5', 'credit',sysdate(),101);
insert into transaction values (1013, 0, 'SGD', 2345, 'trans 6', 'debit',sysdate(),101);

--ID  	CREDIT_AMOUNT  	CURRENCY  	DEBIT_AMOUNT  	TRANSACTION_NARRATIVE  	TRANSACTION_TYPE  	VALUE_DATE  	ACCOUNT_ACCOUNT_NO
--post in to account 200  
insert into transaction values (1014, 10, 'SGD', 0, 'testing transaction', 'credit',sysdate(),200);
insert into transaction values (1015, 20.00, 'SGD', 0, 'transaction 2', 'credit',sysdate(),200);
insert into transaction values (1016, 40.55, 'SGD', 0, '4 - transfer', 'credit',sysdate(),200);
insert into transaction values (1017, 1023, 'SGD', 0, ' ', 'credit',sysdate(),200);
insert into transaction values (1018, 101, 'SGD', 0, 'trans 5', 'credit',sysdate(),200);
insert into transaction values (1019, 0, 'SGD', 2345, 'trans 6', 'debit',sysdate(),200);

--ID  	CREDIT_AMOUNT  	CURRENCY  	DEBIT_AMOUNT  	TRANSACTION_NARRATIVE  	TRANSACTION_TYPE  	VALUE_DATE  	ACCOUNT_ACCOUNT_NO
--post in to account 201
insert into transaction values (1020, 10, 'SGD', 0, 'testing transaction', 'credit',sysdate(),201);
insert into transaction values (1021, 20.00, 'SGD', 0, 'transaction 2', 'credit',sysdate(),201);
insert into transaction values (1022, 30, 'SGD', 0, 'testing transaction 3', 'credit',sysdate(),201);
insert into transaction values (1023, 40.55, 'SGD', 0, '4 - transfer', 'credit',sysdate(),201);
insert into transaction values (1024, 101, 'SGD', 0, 'trans 5', 'credit',sysdate(),201);
insert into transaction values (1025, 0, 'SGD', 2345, 'trans 6', 'debit',sysdate(),201);
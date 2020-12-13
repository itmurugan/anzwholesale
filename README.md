# Getting Started

This applications is built using Maven, Java 11, Spring boot, Spring, Spring JPA, Swagger and H2.

The application code can be built and run using maven

Assuming that Java and Maven already installed and required environment variables are already set



To Build and run the application
--------------------------------
Step 1 to build - CD to your project folder 
Step 2 - Issue Maven command to build - mvn clean install
Step 3 - Run  the application - mvn spring-boot:run

It will start the application and then you can test the services using a web browser or Post man

Swagger documentation
-------------------------
Swagger documentation can be found in the below locations
http://localhost:8080/v2/api-docs

Swagger UI can be access from the below URL
http://localhost:8080/swagger-ui.html


Testing with the services
-------------------------


This application contains two services that will return account listing and transactions listing

Account service end point is listed below 
http://localhost:8080/customers/{customer-id}/accounts


Transaction service end points
http://localhost:8080/accounts/{account-no}/transactions


Sample test requests for testing account web service
http://localhost:8080/customers/1/accounts
http://localhost:8080/customers/2/accounts

for the above requests it will return a valid JSON with account listing sample response is given below
---------------------------------
[
    {
        "accountNo": 100,
        "accountName": "My SGD account",
        "accountType": "current",
        "balanceDate": "12/12/2020",
        "currency": "SGD",
        "openingAvailbleBalance": "1,232,323,320.00"
    },
    {
        "accountNo": 101,
        "accountName": "My USD account",
        "accountType": "current",
        "balanceDate": "12/12/2020",
        "currency": "USD",
        "openingAvailbleBalance": "100.03"
    },
    {
        "accountNo": 102,
        "accountName": "My Savings account",
        "accountType": "Savings",
        "balanceDate": "12/12/2020",
        "currency": "SGD",
        "openingAvailbleBalance": "1,321,300.00"
    },
    {
        "accountNo": 103,
        "accountName": "My loan account",
        "accountType": "current",
        "balanceDate": "12/12/2020",
        "currency": "SGD",
        "openingAvailbleBalance": "100.00"
    }
]

For invalid customer ids it will say customer not found
Sample request and response 
http://localhost:8080/customers/10/accounts

Response 
-------
{
    "timestamp": "2020-12-13T03:58:59.476+00:00",
    "message": "Customer not found",
    "details": "uri=/customers/10/accounts"
}

In the same way transaction service can be invoked by this the below URI

http://localhost:8080/accounts/{account-no}/transactions

sample requests valid requests 
http://localhost:8080/accounts/100/transactions
http://localhost:8080/accounts/200/transactions

And the valid responses will be like
{
    "accountNo": 200,
    "acocuntName": "My SGD account",
    "tractionsList": [
        {
            "valueDate": "Dec, 12, 2020",
            "currency": "SGD",
            "debitAmount": "0.00",
            "creditAmount": "10.00",
            "transactionType": "credit",
            "transactionNarrative": "testing transaction"
        },
        {
            "valueDate": "Dec, 12, 2020",
            "currency": "SGD",
            "debitAmount": "0.00",
            "creditAmount": "20.00",
            "transactionType": "credit",
            "transactionNarrative": "transaction 2"
        },
        {
            "valueDate": "Dec, 12, 2020",
            "currency": "SGD",
            "debitAmount": "0.00",
            "creditAmount": "40.55",
            "transactionType": "credit",
            "transactionNarrative": "4 - transfer"
        },
        {
            "valueDate": "Dec, 12, 2020",
            "currency": "SGD",
            "debitAmount": "0.00",
            "creditAmount": "1,023.00",
            "transactionType": "credit",
            "transactionNarrative": " "
        },
        {
            "valueDate": "Dec, 12, 2020",
            "currency": "SGD",
            "debitAmount": "0.00",
            "creditAmount": "101.00",
            "transactionType": "credit",
            "transactionNarrative": "trans 5"
        },
        {
            "valueDate": "Dec, 12, 2020",
            "currency": "SGD",
            "debitAmount": "2,345.00",
            "creditAmount": "0.00",
            "transactionType": "debit",
            "transactionNarrative": "trans 6"
        }
    ]
}

For invalid account ids, the service will respond back with account not found error
Sample invalid requests and response

http://localhost:8080/accounts/1000/transactions

Response 
--------
{
    "timestamp": "2020-12-13T04:03:05.503+00:00",
    "message": "Account not found",
    "details": "uri=/accounts/1000/transactions"
}
 
Test data
-----------
SQL data is in the below file which is used by H2 in memory database and resources are created there. For more test data, please add more records here
src/main/resources/data.sql



### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#using-boot-devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-security)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)


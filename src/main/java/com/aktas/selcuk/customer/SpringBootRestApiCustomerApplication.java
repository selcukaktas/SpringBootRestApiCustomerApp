package com.aktas.selcuk.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestApiCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiCustomerApplication.class, args);
	}

}
// entity, repository extends JpaRepository<Customer,Long>.  servis controller
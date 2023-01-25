package com.aktas.selcuk.customer.repository;

import com.aktas.selcuk.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}

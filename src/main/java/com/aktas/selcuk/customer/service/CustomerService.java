package com.aktas.selcuk.customer.service;

import com.aktas.selcuk.customer.entity.Customer;
import com.aktas.selcuk.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }

    public Customer findCustomerById(Long customerId) {
        return  customerRepository.findById(customerId).get();
    }
    public void deleteCustomerById(Long customerId) {
        customerRepository.deleteById(customerId);
    }
}

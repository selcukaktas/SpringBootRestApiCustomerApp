package com.aktas.selcuk.customer.controller;

import com.aktas.selcuk.customer.entity.Customer;
import com.aktas.selcuk.customer.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<Customer> addCustomer(@Valid @RequestBody Customer customer) {
        Customer adedCustomer = customerService.addCustomer(customer);
        return new ResponseEntity<Customer>(adedCustomer, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        List<Customer> allCustomer = customerService.findAllCustomer();
        return new ResponseEntity<List<Customer>> (allCustomer,HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Long CustomerId) {
        Customer customerById = customerService.findCustomerById(CustomerId);
        return new ResponseEntity<Customer>(customerById,HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCustomerById(@PathVariable("id") Long CustomerId){
        customerService.deleteCustomerById(CustomerId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

}

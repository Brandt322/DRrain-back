package com.drain.controller;

import com.drain.model.entity.Customer;
import com.drain.service.CustomerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerServiceImpl customerServiceimpl;
    public CustomerController( CustomerServiceImpl customerServiceimpl){
        this.customerServiceimpl = customerServiceimpl;
    }

    @GetMapping
    public ResponseEntity<Iterable<Customer>> customers(){
        Iterable<Customer> customerList = customerServiceimpl.getAll();
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerServiceimpl.save(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

}

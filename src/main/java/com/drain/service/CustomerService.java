package com.drain.service;

import com.drain.model.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
public interface CustomerService {
    List<Customer> getAll();
    Customer save(Customer customer);
    Customer edit(Long id);
    Customer delete(Long id);


}

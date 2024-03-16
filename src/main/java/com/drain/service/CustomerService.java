package com.drain.service;

import com.drain.model.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();

    Customer findById(Long id);

    Customer save(Customer customer);

    Customer update(Long id, Customer customer);

    boolean delete(Long id);
}

package com.drain.service;

import com.drain.model.entity.Customer;
import com.drain.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;
    public CustomerServiceImpl( CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> getAll() {
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }

    @Override
    public Customer findById(Long id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        return customerOptional.get();
    }

    @Override
    public Customer save(Customer customer) {
        customer = customerRepository.save(customer);
        return customer;
    }

    @Override
    public Customer update(Long id, Customer customer) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (!customerOptional.isPresent()) {
            System.out.println("Customer not found");
        }
        Customer customerUpdate = customerOptional.get();

        customerUpdate.setUserName(customer.getUserName());
        customerUpdate.setLastName(customer.getLastName());
        customerUpdate.setFirstName(customer.getFirstName());
        customerUpdate.setPhone(customer.getPhone());
        customerUpdate.setAddress1(customer.getAddress1());
        customerUpdate.setAddress2(customer.getAddress2());
        customerUpdate.setCountry(customer.getCountry());
        customerUpdate.setCity(customer.getCity());
        customerUpdate.setProvince(customer.getProvince());
        customerUpdate.setPostalCode(customer.getPostalCode());

        customerUpdate = customerRepository.save(customerUpdate);
        return customerUpdate;
    }

    @Override
    public boolean delete(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
            if (customer !=null){
                 customerRepository.deleteById(id);
                 return true;
            }
        return false;
    }
}

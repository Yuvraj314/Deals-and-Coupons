package com.capg.dac.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.dac.model.Customer;

@Service
public interface CustomerService {

	Customer addCustomer(Customer customer);
	Customer login(int customerId, String customerName);
	List<Customer> getAllCustomer();
}

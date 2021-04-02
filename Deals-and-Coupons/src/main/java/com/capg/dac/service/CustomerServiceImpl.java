package com.capg.dac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.dac.model.Customer;
import com.capg.dac.repository.CustomerRepository;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepo;
	
	@Override
	public Customer addCustomer(Customer customer) {
		customerRepo.save(customer);
		return customer;
	}

	@Override
	public Customer login(int customerId, String customerName) {
		// TODO Auto-generated method stub
		System.out.println("Welcome Mr. " + customerName);
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> customer = customerRepo.findAll();
		return customer;
	}

	
	
	
}

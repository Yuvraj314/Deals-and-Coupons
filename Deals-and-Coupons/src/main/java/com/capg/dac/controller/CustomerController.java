package com.capg.dac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dac.model.Customer;
import com.capg.dac.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;

	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		List<Customer> customerList = customerservice.getAllCustomer();
		return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);
		
	}
}

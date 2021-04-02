package com.capg.dac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.dac.exception.FoodNotFoundException;
import com.capg.dac.model.Coupon;
import com.capg.dac.model.FoodApp;
import com.capg.dac.repository.FoodRepository;

@Service
@Transactional
public class FoodServiceImpl implements FoodService{
	
	@Autowired
	private FoodRepository foodrepo;
	
	Coupon coupon = new Coupon();
	
	@Override
	public List<FoodApp> viewAllFood() {
		List<FoodApp> food = foodrepo.findAll();
		return food;
	}

	@Override
	public FoodApp orderFood(int id) throws FoodNotFoundException{
		Optional<FoodApp> o = foodrepo.findById(id);
		if(o.isPresent())
		{
			System.out.println("Your Food is Ordered.");
			int c = 20;
			coupon.setCashpoints(coupon.getCashpoints()+c);
			System.out.println("You got " +c+ " rupees as cashpoints.");
			System.out.println("Your balance is : "+coupon.getCashpoints()+" rupees.");
			return o.get();
		}
		throw new FoodNotFoundException("Food is not found.");
	}
}

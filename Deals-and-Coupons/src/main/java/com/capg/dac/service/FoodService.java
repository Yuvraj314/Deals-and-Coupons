package com.capg.dac.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.dac.exception.FoodNotFoundException;
import com.capg.dac.model.FoodApp;

@Service
public interface FoodService {

	List<FoodApp> viewAllFood();
	FoodApp orderFood(int id) throws FoodNotFoundException;
}

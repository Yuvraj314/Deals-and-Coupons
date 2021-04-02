package com.capg.dac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dac.exception.FoodNotFoundException;
import com.capg.dac.model.FoodApp;
import com.capg.dac.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {

	@Autowired
	private FoodService foodService;
	
	@GetMapping("/order/{id}")
	public ResponseEntity<FoodApp> findSeatById(@PathVariable("id") int id) throws FoodNotFoundException{
		FoodApp foodApp = foodService.orderFood(id);
		ResponseEntity<FoodApp> response = new ResponseEntity<>(foodApp, HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/getAllFood")
	public ResponseEntity<List<FoodApp>> getAllFoodApp(){
		List<FoodApp> foodAppList = foodService.viewAllFood();
		return new ResponseEntity<List<FoodApp>>(foodAppList, HttpStatus.OK);
		
	}
}

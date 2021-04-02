package com.capg.dac.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FoodApp")
public class FoodApp {
	
private int id;	
private String foodName;
private double price;

public FoodApp(int id, String foodName, double price) {
	super();
	this.id = id;
	this.foodName = foodName;
	this.price = price;
}

public int getId() {
	return id;
}

public void setFoodId(int id) {
	this.id = id;
}

public String getFoodName() {
	return foodName;
}

public void setFoodName(String foodName) {
	this.foodName = foodName;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "FoodApp [foodId=" + id + ", foodName=" + foodName + ", price=" + price + "]";
}



}

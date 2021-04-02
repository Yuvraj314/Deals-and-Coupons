package com.capg.dac.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Customer")
public class Customer {
	
@Id
private int id;
private String customerName;
private double balance;

@DBRef(lazy = true)
private List<Coupon> coupon;

public Customer(int id, String customerName, double balance, List<Coupon> coupon) {
	super();
	this.id = id;
	this.customerName = customerName;
	this.balance = balance;
	this.coupon = coupon;
}




public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public List<Coupon> getCoupon() {
	return coupon;
}

public void setCoupon(List<Coupon> coupon) {
	this.coupon = coupon;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", customerName=" + customerName + ", balance=" + balance + ", coupon=" + coupon
			+ "]";
}

}
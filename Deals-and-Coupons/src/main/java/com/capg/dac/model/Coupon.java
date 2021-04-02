package com.capg.dac.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Coupon")
public class Coupon {
	
@Id
private int id;	
private double cashpoints;



public Coupon() {
	super();
}


public Coupon(int id, double cashpoints) {
	super();
	this.id = id;
	this.cashpoints = cashpoints;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getCashpoints() {
	return cashpoints;
}

public void setCashpoints(double cashpoints) {
	this.cashpoints = cashpoints;
}


@Override
public String toString() {
	return "Coupon [id=" + id + ", cashpoints=" + cashpoints + "]";
}

}

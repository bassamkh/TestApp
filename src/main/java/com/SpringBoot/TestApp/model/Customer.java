package com.SpringBoot.TestApp.model;

public class Customer extends User {
	private double years;

	public Customer(double y) {
		if (y >= 2) {
			setPercentage(0.05);
		} else {
			setPercentage(0);
		}
	}

}

package com.SpringBoot.TestApp.model.service;

import com.SpringBoot.TestApp.model.Bill;
import com.SpringBoot.TestApp.model.Item;

public class Services {
	public void addToBill(Bill b, Item t) {
		b.getList().add(t);
	}

	public void aemoveFromList(Bill b, Item t) {
		b.getList().remove(t);
	}

	public double discountPerHundred(double price) {
		int mod = (int) price % 100;
		price -= mod * 5;
		return price;
	}

	public double calculateBill(Bill b) {
		double lastPrice = 0;

		for (int i = 0; i < b.getList().size(); i++) {
			// if list contains groceries, the groceries do not get a percentage discount
			// or if user is a regular customer with no discount
			if (b.getList().get(i).getItemType().equals("Groceries")) {

				lastPrice += b.getList().get(i).getPrice();
			} else {

				lastPrice += b.getList().get(i).getPrice()
						- b.getList().get(i).getPrice() * b.getUser().getPercentage();

			}

		}

		// for every 100$ there's a 5% Discount
		lastPrice = discountPerHundred(lastPrice);

		return lastPrice;
	}
}

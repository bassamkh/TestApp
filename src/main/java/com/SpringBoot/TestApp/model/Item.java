package com.SpringBoot.TestApp.model;

public class Item {
	private ItemType type;
	private double price;

	public Item(ItemType type, double price) {
		super();
		this.type = type;
		this.price = price;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

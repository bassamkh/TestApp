package com.SpringBoot.TestApp.model;

public enum ItemType {
	GROCERIES("Groceries"), ELECTRONICS("Electronics"), CLOTHING("Clothing");

	private final String type;

	ItemType(String str) {
		type = str;
	}

	public String getItemType() {
		return type;
	}

}

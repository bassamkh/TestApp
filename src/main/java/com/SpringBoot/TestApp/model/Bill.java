package com.SpringBoot.TestApp.model;

import java.util.ArrayList;

public class Bill {
	private ArrayList<Item> list;

	public Bill() {
		super();
		this.list = new ArrayList();
	}

	public ArrayList<Item> getList() {
		return list;
	}

	public void setList(ArrayList<Item> list) {
		this.list = list;
	}

}

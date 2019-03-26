package com.SpringBoot.TestApp.model;

import java.util.ArrayList;

public class Bill {
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private ArrayList<Item> list;
	private User user;

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

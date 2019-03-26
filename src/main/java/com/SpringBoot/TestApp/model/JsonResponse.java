package com.SpringBoot.TestApp.model;

public class JsonResponse {
	private long id;
	private double value;
	private String value2;

	public JsonResponse(long id, double value, String value2) {
		super();
		this.id = id;
		this.value = value;
		this.value2 = value2;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}
}

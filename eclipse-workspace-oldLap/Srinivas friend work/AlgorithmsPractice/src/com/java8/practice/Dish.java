package com.java8.practice;

public class Dish {

	private int calories;
	private String type;

	public Dish() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "type :  " + type + " , calories " + calories;
	}
}

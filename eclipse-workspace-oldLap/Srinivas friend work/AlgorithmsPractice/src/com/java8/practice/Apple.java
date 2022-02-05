package com.java8.practice;

public class Apple {

	int weight;
	String country;
	

	public Apple(int weight, String country) {
		this.weight = weight;
		this.country = country;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "weight : " + weight  + " , country : " + country;
	}
}

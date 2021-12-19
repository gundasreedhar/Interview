package com.gunda.Magic;

 
public class Tyre 
{
	private String brand;

	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	Tyre()
	{
		System.out.println("tyre created");
	}
	@Override
	public String toString() {
		return " : " + brand;
	}

	
	
}

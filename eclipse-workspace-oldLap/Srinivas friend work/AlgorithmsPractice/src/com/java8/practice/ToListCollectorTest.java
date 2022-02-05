package com.java8.practice;

import java.util.List;

import java.util.ArrayList;

public class ToListCollectorTest {
	
	public static void main(String[] args) {
		List<String> data = new ArrayList<>();
		data.add("Mohit");
		data.add("Rohit");
		
		List<String> output = data.stream().collect(new ToListCollector<>());
		
		System.out.println("output is " + output);
	}

}

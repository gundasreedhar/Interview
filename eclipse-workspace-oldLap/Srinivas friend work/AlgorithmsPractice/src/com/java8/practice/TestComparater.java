package com.java8.practice;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;

public class TestComparater {

	public static void main(String[] args) {

		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple(10, "India"));
		apples.add(new Apple(10, "America"));
		apples.add(new Apple(30, "China"));

		apples.sort(comparing((Apple a) -> a.getWeight()).thenComparing(Apple :: getCountry));

		System.out.println(apples);

		
		String first = "Mohitkkk";
		String second = "Rohitdd";
		List<String> slist = new ArrayList<>();
		slist.add(first);
		slist.add(second);
		slist.sort(comparing(String::length));
		
		System.out.println(slist);
		
		
	}
}

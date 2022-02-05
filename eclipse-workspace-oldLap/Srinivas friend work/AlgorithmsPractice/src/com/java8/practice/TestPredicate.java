package com.java8.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {

		Predicate<Apple> appleCountryPredicate = a -> "India".equals(a.getCountry());

		Predicate<Apple> appleCountryAndHeavyOrAmericaPredicate = appleCountryPredicate.and(a -> (a.getWeight() > 150))
				.or(a -> "America".equalsIgnoreCase(a.getCountry()));

		testPredicateWithData(appleCountryAndHeavyOrAmericaPredicate);

	}

	private static void testPredicateWithData(Predicate<Apple> appleCountryAndHeavyOrAmericaPredicate) {

		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple(200, "India"));
		apples.add(new Apple(200, "Brazil"));
		apples.add(new Apple(100, "America"));
		apples.add(new Apple(100, "Russia"));
		apples.add(new Apple(200, "Solvankia"));

		List<Apple> resultApples = new ArrayList();
		for (Apple apple : apples) {
			if (appleCountryAndHeavyOrAmericaPredicate.test(apple))
				resultApples.add(apple);
		}

		System.out.println("Result apples are : " + resultApples);

	}

}

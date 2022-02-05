package com.java8.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestGrouping {

	public static void main(String[] args) {

		List<Dish> dishes = new ArrayList<>();
		Dish dish1 = new Dish();
		dish1.setCalories(300);
		dish1.setType("nonveg");

		Dish dish2 = new Dish();
		dish2.setCalories(700);
		dish2.setType("veg");

		Dish dish3 = new Dish();
		dish3.setCalories(800);
		dish3.setType("nonveg");

		dishes.add(dish1);
		dishes.add(dish2);
		dishes.add(dish3);

		Map<String, List<Dish>> typeDishMap = dishes.stream().collect(Collectors.groupingBy(dish -> dish.getType()));
		System.out.println("Dish Map By Type " + typeDishMap);

		/*
		 * Map<CaloricLevel, List<Dish>> calrieDishMap =
		 * dishes.stream().collect(Collectors.groupingBy( dish -> {
		 * 
		 * } ));
		 */

		Map<CaloricLevel, List<Dish>> caloricLevelMap = dishes.stream().collect(Collectors.groupingBy(dish -> {
			if (dish.getCalories() < 400)
				return CaloricLevel.DIET;
			else if (dish.getCalories() < 700)
				return CaloricLevel.NORMAL;
			else
				return CaloricLevel.FAT;
		}));

		System.out.println("caloricLevelMap is " + caloricLevelMap);

		Map<String,Map<CaloricLevel,List<Dish>>> typeBasedCaloricLevelMap = dishes.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.groupingBy(dish -> {

			if (dish.getCalories() < 400)
				return CaloricLevel.DIET;
			else if (dish.getCalories() <= 700)
				return CaloricLevel.NORMAL;
			else
				return CaloricLevel.FAT;
		}

		)));
		
		System.out.println(" typeBasedCaloricLevelMap is " + typeBasedCaloricLevelMap);
	}
}

enum CaloricLevel {
	NORMAL, DIET, FAT
}

package com.geekTrust;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KingdomMessageUtil {

	static Map<Kingdom, String> kingdomAnimalMappings = new HashMap<>();

	public static void addKingdomAnimalMappings(Kingdom kingdom, String animal) {
		String animalSorted = sortAnimalLexicographically(animal);
		kingdomAnimalMappings.put(kingdom, animalSorted);
	}

	private static String sortAnimalLexicographically(String animal) {
		char ch[] = new char[animal.length()];
		Arrays.sort(ch);
		String animalSorted = ch.toString();
		return animalSorted;
	}

	public static String getAnimalFromKingdom(Kingdom kingdom) {
		return kingdomAnimalMappings.get(kingdom);
	}
}

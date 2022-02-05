package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class AsciiFibnocci {

	public static void main(String[] args) {

		int ascii[] = new int[26];
		ascii = populateAscii(ascii);
		Map<Character, Integer> map = new HashMap<>();
		int a = 65;

		for (int i = 0; i < 26; i++) {
			char ch = (char) a;
			map.put(ch, i);
			a++;

		}

		String testString = "MAN";

		int c = 0;

		int resultSum = 0;

		for (Map.Entry<Character, Integer> dMap : map.entrySet()) {

			if (dMap.getKey().equals('A') || dMap.getKey().equals('B')) {
				c = dMap.getValue();
				dMap.setValue(c);
			} else {

				int val = dMap.getKey();
				int val1 = val - 1;
				int val2 = val - 2;
				char char1 = (char) val1;
				char char2 = (char) val2;
				int g = map.get(char1) + map.get(char2);
				dMap.setValue(g);
			}

			if (testString.contains(dMap.getKey() + "")) {
				resultSum = resultSum + dMap.getValue();
			}

		}

		System.out.println("resultSum is  " + resultSum);
	}

	private static int[] populateAscii(int[] ascii) {
		for (int i = 0; i < 26; i++) {
			ascii[i] = i;
		}
		return ascii;
	}

}

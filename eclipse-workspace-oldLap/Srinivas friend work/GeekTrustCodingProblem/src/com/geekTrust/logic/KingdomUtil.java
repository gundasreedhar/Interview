package com.geekTrust.logic;

import java.util.Arrays;

public class KingdomUtil {
	public final static int rulerVictoryCount = 3;

	public static String sort(String data) {
		String resultString = data.replaceAll("^\"|\"$", "");
		 resultString = resultString.replaceAll("\\P{L}", "");

		resultString = resultString.trim();
		resultString =resultString.toLowerCase();
		char ch[] = resultString.toCharArray();
		Arrays.sort(ch);
		String sortedData = new String(ch);
		return sortedData;
	}

	public static boolean compareData(String animalSymbol, String message) {
		int count = 0;
		int i = animalSymbol.length() - 1;
		int animalLength = animalSymbol.length();
		int j = message.length() - 1;
		while (i >= 0 && j >= 0) {
			if (animalSymbol.charAt(i) == message.charAt(j)) {
				count++;
				i--;
				j--;
				continue;
			}

			j--;

		}
		if (count == animalLength) {
			return true;
		}

		return false;
	}
}

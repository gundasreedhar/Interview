package com.perfios;

import static com.perfois.util.Constants.BILLOIN;
import static com.perfois.util.Constants.MILLION;
import static com.perfois.util.Constants.THOUSAND;

import java.util.HashMap;

public class NumberToStringConverter {

	static HashMap<Integer, String> dataPopulater = new HashMap<Integer, String>();

	static {
		populateContext();
	}

	public static void main(String[] args) {
		NumberToStringConverter numberToStringConverter = new NumberToStringConverter();
		int number = 234567898;
		String ans = numberToStringConverter.wordGenerator(number);
		System.out.println(" result is " + ans);

	}

	public String wordGenerator(int num) {

		StringBuilder stringBuilder = new StringBuilder();

		if (num == 0) {
			return dataPopulater.get(0);
		}

		num = billionChecker(num, stringBuilder);

		num = millionChecker(num, stringBuilder);

		num = thousandChecker(num, stringBuilder);

		resultCombiner(num, stringBuilder);

		return stringBuilder.toString().trim();
	}

	private void resultCombiner(int num, StringBuilder stringBuilder) {
		if (num > 0) {
			stringBuilder.append(convert(num));
		}
	}

	private int thousandChecker(int num, StringBuilder stringBuilder) {
		if (num >= 1000) {
			int extra = num / 1000;
			stringBuilder.append(convert(extra) + THOUSAND);
			num = num % 1000;
		}
		return num;
	}

	private int millionChecker(int num, StringBuilder stringBuilder) {
		if (num >= 1000000) {
			int extra = num / 1000000;
			stringBuilder.append(convert(extra) + MILLION);
			num = num % 1000000;
		}
		return num;
	}

	private int billionChecker(int num, StringBuilder stringBuilder) {
		if (num >= 1000000000) {
			int extra = num / 1000000000;
			stringBuilder.append(convert(extra) + BILLOIN);
			num = num % 1000000000;
		}
		return num;
	}

	public String convert(int num) {

		StringBuilder stringBuilder = new StringBuilder();

		if (num >= 100) {
			int numHundred = num / 100;
			stringBuilder.append(" " + dataPopulater.get(numHundred) + " Hundred");
			num = num % 100;
		}

		if (num > 0) {
			if (num > 0 && num <= 20) {
				stringBuilder.append(" " + dataPopulater.get(num));
			} else {
				int numTen = num / 10;
				stringBuilder.append(" " + dataPopulater.get(numTen * 10));

				int numOne = num % 10;
				if (numOne > 0) {
					stringBuilder.append(" " + dataPopulater.get(numOne));
				}
			}
		}

		return stringBuilder.toString();
	}

	public static void populateContext() {
		dataPopulater.put(0, "Zero");
		dataPopulater.put(1, "One");
		dataPopulater.put(2, "Two");
		dataPopulater.put(3, "Three");
		dataPopulater.put(4, "Four");
		dataPopulater.put(5, "Five");
		dataPopulater.put(6, "Six");
		dataPopulater.put(7, "Seven");
		dataPopulater.put(8, "Eight");
		dataPopulater.put(9, "Nine");
		dataPopulater.put(10, "Ten");
		dataPopulater.put(11, "Eleven");
		dataPopulater.put(12, "Twelve");
		dataPopulater.put(13, "Thirteen");
		dataPopulater.put(14, "Fourteen");
		dataPopulater.put(15, "Fifteen");
		dataPopulater.put(16, "Sixteen");
		dataPopulater.put(17, "Seventeen");
		dataPopulater.put(18, "Eighteen");
		dataPopulater.put(19, "Nineteen");
		dataPopulater.put(20, "Twenty");
		dataPopulater.put(30, "Thirty");
		dataPopulater.put(40, "Forty");
		dataPopulater.put(50, "Fifty");
		dataPopulater.put(60, "Sixty");
		dataPopulater.put(70, "Seventy");
		dataPopulater.put(80, "Eighty");
		dataPopulater.put(90, "Ninety");
	}
}
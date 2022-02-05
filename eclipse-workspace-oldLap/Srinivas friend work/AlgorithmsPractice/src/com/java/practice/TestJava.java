package com.java.practice;

import java.util.Arrays;

public class TestJava {

	private static int testData() {
		try {

			return 2;
		} catch (Exception e) {

			return 5;
		} finally {
			// System.exit(0);
			return 6;
		}

		// return 4;
	}

	public static void main(String[] args) {
		String str = "Mohit";
		String data = reverseRecursively(str);
		System.out.println("reversed string is " + data);

		int revData = reverseNumber(123);
		
		System.out.println("Reverse of a number is " + revData);

	}

	private static int reverseNumber(int i) {

		int rem = 0;
		int n = i;
		int rev = 0;

		
		
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;

		}
		return rev;
	}

	public static String reverseRecursively(String str) {

		if (str.length() < 2)
			return str;

		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}

}

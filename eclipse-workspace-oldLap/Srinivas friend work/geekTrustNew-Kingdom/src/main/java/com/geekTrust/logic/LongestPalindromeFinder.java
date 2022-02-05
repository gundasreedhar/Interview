package com.geekTrust.logic;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromeFinder {

	public static void main(String[] args) {

		String testString = "allkjha";
		int i = 0;
		int j = testString.length() - 1;
		// System.out.println("Palindromic seq length is " +
		// findIfPalindrome(testString, i, j));

		List<Character> charList = new ArrayList<Character>();
		findLongestPalindrome(testString, i, j, charList);
		for (char ch : charList) {
			System.out.println(ch);
		}

	}

	private static int findLongestPalindrome(String testString, int start, int end, List<Character> chArr) {

		if (start > end)
			return chArr.size();

		if (start == end) {
			chArr.add(testString.charAt(start));

			return chArr.size();
		}

		if (testString.charAt(start) == testString.charAt(end)) {
			chArr.add(testString.charAt(start));
			return findLongestPalindrome(testString, start + 1, end - 1, chArr);
		}

		else {

			List<Character> leftCharArray = new ArrayList<Character>();
			int leftSize = findLongestPalindrome(testString, start, end - 1, leftCharArray);
			List<Character> rightCharArray = new ArrayList<Character>();
			int rightSize = findLongestPalindrome(testString, start + 1, end, rightCharArray);
			if (leftSize > rightSize) {
				chArr.addAll(leftCharArray);

			} else {
				chArr.addAll(rightCharArray);
			}

			return chArr.size();
		}

	}

	static int findIfPalindrome(String testString, int start, int last) {

		if (start > last)
			return 0;
		if (start == last)
			return 1;

		if (testString.charAt(start) != testString.charAt(last)) {
			return Math.max(findIfPalindrome(testString, start, last - 1),
					findIfPalindrome(testString, start + 1, last));

		}

		else
			return 2 + findIfPalindrome(testString, start + 1, last - 1);

	}
}

package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class LexicoSmallString {

	public static void main(String[] args) {
		int n = 3;
		int k = 25;

		String s = generateString(n, k);

		System.out.println(s);
	}

	private static String generateString(int n, int k) {

		Map<Character, Integer> map = new HashMap<>();
		int a = 97;
		for (int i = 1; i <= 26; i++) {
			char ch = (char) a;
			map.put(ch, i);
			a++;

		}

		StringBuilder res = new StringBuilder();
		int pos = 0;
		int sum = k;
		while (pos <= n - 1) {
			char val = 'a';
			char valFetch = postVal(val, pos, sum, res, n - pos, map);
			int numericVal = map.get(valFetch);
			sum = sum - numericVal;
			pos = pos + 1;

		}

		// res = checkForLastTwoIndexes(res, map);
		String resStr = res.toString();
		return resStr;
	}

	private static StringBuilder checkForLastTwoIndexes(StringBuilder res, Map<Character, Integer> map) {
		int len = res.length();
		char ch1 = res.charAt(len - 2);
		char ch2 = res.charAt(len - 1);
		int numericCh1 = map.get(ch1);
		int numericCh2 = map.get(ch2);

		while (numericCh1 > 1 && numericCh2 < 26) {
			numericCh1--;
			numericCh2++;
		}

		char ch1Res = (char) (numericCh1 - 1 + 97);
		char ch2Res = (char) (numericCh2 - 1 + 97);

		res.setCharAt(len - 2, ch1Res);
		res.setCharAt(len - 1, ch2Res);

		return res;
	}

	private static char postVal(char val, int pos, int sum, StringBuilder res, int n, Map<Character, Integer> map) {

		int remVal = sum - map.get(val);
		boolean verify = false;
		int intVal = val;
		if (n == 1) {
			if (remVal <= 26) {
				verify = true;
				int data = 97 + remVal;
				char ch = (char) data;
				val = ch;

			} else {
				throw new RuntimeException("Not evaluating !! ");
			}
		}
		if (n > 1) {
			int checkQuotient = remVal / (n - 1);
			int checkRem = remVal % (n - 1);
			verify = checkListOfData(checkQuotient, checkRem);
		}

		if (verify) {
			res.append(val);
			return val;
		} else {
			int numericChar = val;
			numericChar = numericChar + 1;
			char newChar = (char) numericChar;

			return postVal(newChar, pos, sum, res, n, map);
		}

	}

	private static boolean checkListOfData(int checkQuotient, int checkRem) {

		if (checkQuotient > 26)
			return false;
		int remConcatValue = checkRem + checkQuotient;
		if (remConcatValue > 26)
			return false;
		return true;
	}

}

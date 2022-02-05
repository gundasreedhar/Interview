package com.bitwise;

import java.util.Scanner;

public class NumberPowerOf2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPowerOftwo = usingTraditionalApproach(n);
		System.out.println("is Power of tWO " + isPowerOftwo);

		boolean isPowerOfTwoOptimised = optimisedApproach(n);
		System.out.println("is Power of tWO Optimised " + isPowerOftwo);

	}

	private static boolean optimisedApproach(int n) {
		if ((n & (n - 1)) == 0) {
			return true;
		}
		return false;
	}

	private static boolean usingTraditionalApproach(int n) {

		while (n % 2 == 0) {
			n = n / 2;
		}

		return n == 1;

	}

}

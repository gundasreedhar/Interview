package com.bitwise;

import java.util.Scanner;

public class LargestPowerOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		n = convertAllOnesinNToOne(n);

		int largestPower = n + 1 >> 1;

		System.out.println("largest Power of 2 here is " + largestPower);
	}

	private static int convertAllOnesinNToOne(int n) {

		n = n | n >> 1;
		n = n | n >> 2;
		n = n | n >> 4;
		n = n | n >> 8;

		return n;
	}

}

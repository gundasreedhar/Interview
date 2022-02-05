package com.bitwise;

import java.util.Scanner;

public class NumberOfOnesInBinaryRepresentation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ones = countOnes(n);
		System.out.println("ones are : " + ones);
	}

	private static int countOnes(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);
			count++;
		}

		return count;

	}

}

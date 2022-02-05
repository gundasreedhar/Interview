package com.bitwise;

import java.util.Scanner;

public class IthBitSetInBinaryNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = sc.nextInt();

		boolean checkIBit = false;
		if ((n & (1 << i)) == (1<<i))
			checkIBit = true;

		System.out.println("ith bit present " + checkIBit);
	}
}

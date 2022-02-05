package com.bitwise;

import java.util.Scanner;

public class IteratedSums {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		while (a <= b) {
			if (a == b) {
				sum = sum + a*a;
				a = a + 1;
				b = b - 1;
			} else {
				sum = sum + a * a + b * b;
				a = a + 1;
				b = b - 1;
			}
		}
		System.out.println(sum);
	}

}
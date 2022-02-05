package com.bitwise;

import java.util.Scanner;

public class TwoCircles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = sc.nextInt();
		while (numberOfTestCases > 0) {
			int x0 = sc.nextInt();
			int y0 = sc.nextInt();
			int r0 = sc.nextInt();
			;
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();

			double d = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));

			if (Math.abs(r0 - r1) == d) {
				System.out.println("E");
			} else if ((r1 > r0 + d) || (r0 > r1 + d)) {
				System.out.println("I");
			} else {
				System.out.println("O");
			}

			numberOfTestCases--;
		}

	}

}

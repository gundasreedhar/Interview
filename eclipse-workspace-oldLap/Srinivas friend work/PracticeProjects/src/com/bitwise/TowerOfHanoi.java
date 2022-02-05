package com.bitwise;

import java.util.Scanner;
import java.util.Stack;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int A = 1;
		int B = 2;
		int C = 3;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		towerOfHanio(n, A, B, C);

	}

	public static void towerOfHanio(int n, int A, int B, int C) {

		if (n >0) {
			towerOfHanio(n - 1, A, C, B);
			System.out.println("Move from " + A + " to " + C);
			towerOfHanio(n - 1, B, A, C);
		}

	}
}
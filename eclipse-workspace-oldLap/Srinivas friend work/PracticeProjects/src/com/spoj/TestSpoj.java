package com.spoj;

import java.util.Scanner;

public class TestSpoj {


	public static void main(String[] args) throws java.lang.Exception {

		Scanner sc = new Scanner(System.in);
		int operations = sc.nextInt();
		while (operations > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int h = sc.nextInt();
			int w = sc.nextInt();

			int m = 0;
			int n = 0;
			
			if (h == 2)
				m = 3;

			else if (h == 1)
				m = 2;

			if (w == 2)
				n = 3;

			else if (w == 1)
				n = 2;

			x = x * m + 1;
			y = y * n + 1;

			String mat[][] = new String[x][y];

			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					if (i == 0 || i % m == 0) {
						System.out.print("*");
					}

					else {
						if (j == 0 || j % n == 0) {
							System.out.print("*");
						} else {
							System.out.print(".");
						}
					}
				}

				System.out.println();
			}
			operations--;
			System.out.println();

		}

	}
}
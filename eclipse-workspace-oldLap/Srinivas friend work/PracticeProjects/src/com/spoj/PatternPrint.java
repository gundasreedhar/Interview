package com.spoj;

import java.util.Scanner;

public class PatternPrint {

	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);
		int operations = sc.nextInt();

		while (operations > 0) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			int s = sc.nextInt();
			int m = 0;
			int n = 0;
			int mul = 0;
			if (s == 2) {
				mul = 3;
				m = 3;
				n = 3;
			} else {
				mul = 2;
				m = 2;
				n = 2;
			}

			x = x * mul + 1;
			y = y * mul + 1;

			int nFactor = 0;
			int mFactor = 0;
			
			String varT = "\\";
			String pos1T = varT;
			String pos2T = ".";
			
			for (int i = 0; i < x; i++) {

				String var = varT;
				String pos1 = pos1T;
				String pos2 = pos2T;

				for (int j = 0; j < y; j++) {

					int iT = 0;
					int jT = 0;

					iT = i - mFactor * m;

					jT = j - nFactor * n;

					if (i == 0 || i % m == 0) {
						System.out.print("*");
					}

					else {
						if (j == 0 || j % m == 0) {
							System.out.print("*");
						}

						else {
							if (iT == jT || i == j) {
								System.out.print(pos1);

							}

							else {
								System.out.print(pos2);
							}

						}

						if (j % m == 0 && j > 0) {
							String varE = var;
							var = reverse(var);

							if (s != 1) {

								String temp = pos1;
								pos1 = pos2;
								pos2 = temp;

								if (pos1 != ".") {
									pos1 = var;
								} else {
									pos2 = var;
								}
							}

							else {
								pos1 = pos2 = var;
							}
							nFactor = nFactor + 1;

						}
					}
				}

				nFactor = 0;
				System.out.println();

				if (i % m == 0 && i > 0) {
					String varTE = varT;
					varT = reverse(varT);

					if (s != 1) {

						if (pos1T == varTE) {
							pos1T = ".";
							pos2T = varT;
						} else if (pos2T == varTE) {
							pos2T = ".";
							pos1T = varT;
						}
					}

					else {
						pos1T = pos2T = varT;
					}

					mFactor = mFactor + 1;

				}

				else {

					if (i == m - 1) {

					}

					else {

						/*
						 * String temp = pos1T; pos1T = pos2T; pos2T = temp;
						 * if(pos1T != "."){ pos1T = varT; } else{ pos2T = varT;
						 * }
						 */
					}
				}

			}

			System.out.println();
			operations--;

		}

	}

	private static String reverse(String var) {
		String pat1 = "\\";
		String pat2 = "/";
		if (var == "\\")
			return pat2;

		else
			return pat1;

	}

}

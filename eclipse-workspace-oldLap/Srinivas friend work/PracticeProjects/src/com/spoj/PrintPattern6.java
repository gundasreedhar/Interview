package com.spoj;

import java.util.Scanner;

public class PrintPattern6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int operations = sc.nextInt();

		while (operations > 0) {

			int l = sc.nextInt();
			int c = sc.nextInt();
			int h = sc.nextInt();
			int w = sc.nextInt();

			//int factorM = h - 1;
			//int factorN = w - 1;
			
			int midM = h;
			int midN = w;

			midM = midM + 1;
			midN = midN + 1;

			int x = l * h + l + h;
			int y = c * w + c + w;

			int counterM = 1;
			int counterN = 1;

			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {

					if (counterM % midM == 0) {
						if (counterN % midN == 0) {
							System.out.print("+");
						}

						else {
							System.out.print("-");
						}
					}

					else {
						if (counterN % midN == 0) {
							System.out.print("|");
						} else {
							System.out.print(".");
						}
					}

					counterN = counterN + 1;
				}

				System.out.println();
				counterN = 1;
				counterM = counterM + 1;
			}

			operations--;
			System.out.println();

		}
	}

}

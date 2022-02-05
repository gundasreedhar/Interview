package com.bitwise;

import java.util.Scanner;

public class CharacterPattern8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberOfoperations = sc.nextInt();

		while (numberOfoperations > 0) {
			int rows = sc.nextInt();
			int columns = sc.nextInt();
			int size = sc.nextInt();
			int factor = 1;
			if (size == 1)
				factor = factor * 2;
			else if (size == 2)
				factor = factor * 4;

			rows = rows * factor;
			columns = columns * factor;

			int iTemp =0;
			int jTemp = 0;
			int iCounter = 0;
			int jCounter = 0;
			for (int i = 0; i < rows; i++) {

				if (i % factor == 0 && i != 0)
					iCounter = iCounter + 1;

				iTemp = i - iCounter * factor;
				for (int j = 0; j < columns; j++) {
					if (j % factor == 0 && j != 0)
						jCounter = jCounter + 1;
					jTemp = j - jCounter * factor;

					if (size == 2)
						runWithFourPatternPath(iTemp, jTemp);
					else
						runWithTwoPatternPath(iTemp, jTemp);

				}

				System.out.println();
				jCounter = 0;

			}
			System.out.println();

			numberOfoperations--;
		}
	}

	private static void runWithFourPatternPath(int i, int j) {

		if ((i == 0 || i == 3) && (j == 0 || j == 3))   {
				System.out.print(".");
			}
		

		else if ((i == 0 && j == 1) || (i == 3 && j == 3))
			System.out.print("/");

		else if ((i == 0 && j == 2) || (i == 3 && j == 1)) {
			System.out.print("\\");
		}

		else if ((i == 1 || i == 2) && (j == 1 || j == 2)) {
			System.out.print("*");
		}

		else if ((i == 1 && j == 0) || (i == 2 && j == 3) || (i == 3 && j == 2)) {
			System.out.print("/");
		}

		else if ((i == 2 || j == 0) || (i == 1 && j == 3)) {
			System.out.print("\\");
		}

	}

	private static void runWithTwoPatternPath(int i, int j) {

		if ((i == 0 && j == 0) || (i == 1 && j == 1)) {
			System.out.print("/");
		}

		else if ((i == 1 && j == 0) || (i == 0 && j == 1)) {
			System.out.print("\\");
		}

	}
}

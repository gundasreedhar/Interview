package com.perfios;

public class MaximumSquareSubMatrix {

	public static void main(String[] args) {
		int mat[][] = { { 0, 0, 1, 1, 0 }, { 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0 },
				{ 1, 1, 1, 1, 1 } };

		int nRows = 6;
		int nColumns = 5;
		int max = 1;

		int resMat[][] = new int[nRows][nColumns];

		for (int i = 0; i < nRows; i++) {
			for (int j = 0; j < nColumns; j++) {
				if (mat[i][j] == 0)
					resMat[i][j] = 1;
			}
		}

		for (int i = 1; i < nRows; i++) {
			for (int j = 1; j < nColumns; j++) {
				if (resMat[i][j] == 1) {
					resMat[i][j] = Math.min(Math.min(resMat[i - 1][j - 1], resMat[i - 1][j]), resMat[i][j - 1]) + 1;
					if (resMat[i][j] > max)
						max = resMat[i][j];
				}
			}
		}

		System.out.println("The maximum size of sub-square matrix is " + max);

	}

}

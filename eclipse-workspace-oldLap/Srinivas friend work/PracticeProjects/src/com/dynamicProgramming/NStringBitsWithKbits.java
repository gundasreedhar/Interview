package com.dynamicProgramming;

import java.util.Scanner;

public class NStringBitsWithKbits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int arr[] = new int[n];
		findkbitsInNArray(arr, k, n);
	}

	private static void findkbitsInNArray(int[] arr, int k, int n) {
		if (n < 1)
			printArr(arr);

		else {
			for (int i = 0; i < k; i++) {
				arr[n - 1] = i;
				findkbitsInNArray(arr, k, n - 1);

			}
		}

	}

	static void printArr(int arr[]) {
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

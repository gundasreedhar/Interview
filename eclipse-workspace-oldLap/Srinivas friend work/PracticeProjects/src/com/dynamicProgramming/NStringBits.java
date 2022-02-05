package com.dynamicProgramming;

import java.util.Scanner;

public class NStringBits {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		bitStringPrint(arr, n);

	}

	private static void bitStringPrint(int arr[], int n) {
		if (n < 1) {
			printArr(arr);
		}

		else {
			arr[n - 1] = 0;
			bitStringPrint(arr, n - 1);
			arr[n - 1] = 1;
			bitStringPrint(arr, n - 1);

		}
	}

	static void printArr(int arr[]) {
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
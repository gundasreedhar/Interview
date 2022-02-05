package com.algorithm.array;

public class ArrayRotation {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int d = 2;
	//	rotateArrayMethod1(arr, d);
		System.out.println(".......................................... ");
		rotateArrayMethod2(arr, d);
	}

	static void rotateArrayMethod1(int arr[], int d) {

		int n = arr.length;
		int k = 0;
		while (k < d) {

			int i = 0;
			int temp = arr[i];
			for (; i < n - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[i] = temp;
			k++;
		}

		System.out.println("Rotated array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	static void rotateArrayMethod2(int arr[], int d) {
		int n = arr.length;
		for (int i = 0; i < gcd(d, n); i++) {
			int temp = arr[i];
			int j = i;

			while (true) {

				int k = j + d;
				if (k >= n) {
					k = k - n;
				}

				if (k == i)
					break;

				arr[j] = arr[k];
				j = k;

			}

			arr[j] = temp;

		}

		System.out.println("Rotated array 2 is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	static int gcd(int a, int b) {

		if (b == 0)
			return a;

		return gcd(b, a % b);

	}
}
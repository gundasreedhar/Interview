package com.threads;

public class MinNumOfJumpsToReachEnd {

	public static void main(String[] args) {

		int start = 0;
		int end = 0;
		int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		int minPath = findMinPath(arr, start, end);
		System.out.println("Min Route path is  " + minPath);
	}

	static int findMinPath(int arr[], int start, int end) {

		if (end >= arr.length - 1) {
			return 0;
		}

		int min = Integer.MAX_VALUE;
		start = end;
		end = arr[start] + end;
		int j = start;
		int value = 0;
		for (int i = start; i < end; i++) {

			value = findMinPath(arr, j, i + 1) + 1;

			if (value < min) {
				min = value;
			}
		}

		return min;
	}
}

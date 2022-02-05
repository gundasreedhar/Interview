package com.threads;

public class MinNumOfJumpsToReachEndDP {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		int numOfJumps = minNumOfJumps(arr);
		System.out.println("min No Of jumps are : " + numOfJumps);
	}

	private static int minNumOfJumps(int[] arr) {

		int n = arr.length;
		int jumps[] = new int[n];
		jumps[0] = 0;

		for (int i = 1; i < n; i++) {
			jumps[i] = Integer.MAX_VALUE;
			for (int j = 0; j < i; j++) {
				if ((i <= (arr[j] + j)) && jumps[j] != Integer.MAX_VALUE) {

					jumps[i] = Math.min(jumps[i], jumps[j] + 1);
					break;
				}

			}
		}

		return jumps[n - 1];

	}
}

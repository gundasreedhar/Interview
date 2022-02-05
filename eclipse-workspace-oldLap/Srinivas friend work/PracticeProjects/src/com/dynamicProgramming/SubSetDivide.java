package com.dynamicProgramming;

public class SubSetDivide {

	public static void main(String args[]) {

		int arr[] = { 3, 1, 7, 5 };
		int checkVal = 6;
		int n = arr.length;
		int sum = 0;
		boolean isSubsetDivide = findSubSetDivide(arr, n, checkVal, sum);
		System.out.println("isSubSetDivide " + isSubsetDivide);

	}

	static boolean findSubSetDivide(int arr[], int n, int checkVal, int sum) {

		if (n == 0)
			return false;

		if (arr[n - 1] > checkVal) {
			return findSubSetDivide(arr, n - 1, checkVal, sum);
		}

		if ((arr[n - 1] % checkVal == 0) || ((sum + arr[n - 1]) % checkVal == 0))
			return true;

		else
			return findSubSetDivide(arr, n - 1, checkVal, sum)
					|| findSubSetDivide(arr, n - 1, checkVal, sum + arr[n - 1]);

	}

}
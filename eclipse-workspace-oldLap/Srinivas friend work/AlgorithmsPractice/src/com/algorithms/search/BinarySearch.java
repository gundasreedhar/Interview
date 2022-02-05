package com.algorithms.search;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1,2,3, 5, 6, 7, 8, 10 };
		int data = 3;
		boolean isPresent = isPresent(data, arr);
		System.out.println("isPresent is " + isPresent);
	}

	private static boolean isPresent(int data, int arr[]) {

		int length = arr.length;
		int start = 0;
		int end = length - 1;

		boolean isFound = false;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == data) {
				isFound = true;
				break;
			}

			else if (data < arr[mid]) {
				end = mid - 1;
			}

			else if (data > arr[mid]) {
				start = mid + 1;
			}

		}

		return isFound;

	}

}

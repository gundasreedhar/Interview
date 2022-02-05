package com.java.practice;

public class LinearSearch {

	public static void main(String args[]) {
		int arr[] = { 2, 3, 5, 9, 10, 0, 1, 10 };
		boolean isPresent = binarySearch(2, arr);
		System.out.println("isPresent : " + isPresent);

	}

	static boolean binarySearch(int data, int arr[]) {
		boolean isPresent = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				isPresent = true;
				break;
			}
		}

		

		return isPresent;
	}

}
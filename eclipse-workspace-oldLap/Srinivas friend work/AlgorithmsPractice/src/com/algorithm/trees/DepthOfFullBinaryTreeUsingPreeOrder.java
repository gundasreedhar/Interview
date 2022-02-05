package com.algorithm.trees;

public class DepthOfFullBinaryTreeUsingPreeOrder {

	public static void main(String[] args) {

		// 0- leaf , 1 - node
		int arr[] = { 1, 0, 1, 1, 0, 0, 0 };
		int depth = depthUsingPreOrder(arr, 0);
		
		System.out.println("Depth is " + depth);
	}

	private static int depthUsingPreOrder(int[] arr, int index) {

		int len = arr.length;
		if (index >= len || arr[index] == 0) {
			return 0;
		}

		index = index + 1;
		int leftHeight = depthUsingPreOrder(arr, index);
		index = index + 1;
		int rightHeight = depthUsingPreOrder(arr, index);

		return Math.max(leftHeight, rightHeight) + 1;

	}

}

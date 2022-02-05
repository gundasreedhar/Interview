package com.algorithm.trees;

public class TreeFormUsingArray {

	public static void main(String arr[]) {

		int arrData[] = { 10, 12, 15, 25, 30, 36 };
		TreeNode root = new TreeNode(arrData[0]);
		int n = arrData.length;
		createTree(root, 0, n, arrData);

		printInOrder(root);

	}

	static void createTree(TreeNode root, int index, int n, int arr[]) {

		int leftIndex = 2 * index + 1;

		if (leftIndex < n) {

			root.left = new TreeNode(arr[leftIndex]);
			createTree(root.left, leftIndex, n, arr);

		}

		int rightIndex = 2 * index + 2;
		if (rightIndex < n) {
			root.right = new TreeNode(arr[rightIndex]);
			createTree(root.right, rightIndex, n, arr);
		}

	}

	static void printInOrder(TreeNode root) {
		if(root == null)
			return;
		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);
	}

}

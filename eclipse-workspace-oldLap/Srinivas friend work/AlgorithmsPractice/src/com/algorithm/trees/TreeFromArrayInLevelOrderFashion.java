package com.algorithm.trees;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class TreeFromArrayInLevelOrderFashion {

	public static void main(String args[]) {

		int arr[] = { 1, 2, 3, 4, 5, 6 ,6,6,6,6};

		createTree(arr);

	}

	static void createTree(int arr[]) {

		int n = arr.length;
		int index = 0;
		Queue<TreeNode> queue = new LinkedBlockingQueue();
		TreeNode root = new TreeNode(arr[index]);
		queue.add(root);
		index = index + 1;

		while (index < n) {

			TreeNode parent = queue.poll();
			TreeNode left = new TreeNode(arr[index]);
			queue.add(left);
			parent.left = left;
			index = index + 1;
			if (index < n) {
				TreeNode right = new TreeNode(arr[index]);
				queue.add(right);
				parent.right = right;
				index = index + 1;
			}

		}

		printInOrder(root);
	}

	static void printInOrder(TreeNode root) {

		if (root == null)
			return;

		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);

	}
}

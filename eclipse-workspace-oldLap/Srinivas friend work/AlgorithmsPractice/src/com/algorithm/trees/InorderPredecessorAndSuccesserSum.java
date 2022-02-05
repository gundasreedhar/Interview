package com.algorithm.trees;

import java.util.ArrayList;
import java.util.List;

public class InorderPredecessorAndSuccesserSum {

	static int index = 1;

	public static void main(String args[]) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		List<Integer> rootValues = new ArrayList<Integer>();
		rootValues.add(0);
		TreeNode temp = root;
		generateListForInOrder(temp, rootValues);
		rootValues.add(0);
		TreeNode temp1 = root;
		generateSumTree(temp1, rootValues);

		printInOrder(root);
		// print inorder

	}

	private static void printInOrder(TreeNode root) {
		if (root == null)
			return;

		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);

	}

	static void generateListForInOrder(TreeNode root, List<Integer> rootValues) {

		if (root == null)
			return;

		generateListForInOrder(root.left, rootValues);
		rootValues.add(root.data);
		generateListForInOrder(root.right, rootValues);

	}

	static void generateSumTree(TreeNode root, List<Integer> rootValues) {

		if (root == null) {
			return;
		}

		generateSumTree(root.left, rootValues);
		root.data = rootValues.get(index - 1) + rootValues.get(index + 1);
		++index;
		generateSumTree(root.right, rootValues);

	}

}
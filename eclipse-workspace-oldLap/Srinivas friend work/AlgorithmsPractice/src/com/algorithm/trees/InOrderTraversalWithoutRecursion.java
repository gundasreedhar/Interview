package com.algorithm.trees;

import java.util.Stack;

class InOrderTraversalWithoutRecursion {

	public static void main(String args[]) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(6);
		root.left.left.right = new TreeNode(7);

		inOrderTraversal(root);

	}

	private static void inOrderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		while (root != null) {

			stack.push(root);
			root = root.left;

			while (root == null && !stack.isEmpty()) {
				root = stack.pop();
				System.out.println(root.data);
				root = root.right;

			}

		}

	}

}

class TreeNode {

	TreeNode left;
	TreeNode right;
	int data;

	TreeNode(int data) {
		this.data = data;
	}

}
package com.algorithm.trees;

import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

public class FlipBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		flipTree(root);
	}

	private static void flipTree(TreeNode root) {

		Stack<TreeNode> stack = new Stack<>();
		while (root != null) {
			stack.push(root);
			root = root.left;
		}

		TreeNode prev = null;
		TreeNode start = null;
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (prev == null) {
				prev = node;
				start = node;
			}

			else {
				prev.right = node;
				prev.left = node.right;
				prev = prev.right;
			}

		}

		printTree(start);

	}

	private static void printTree(TreeNode start) {
		if (start == null)
			return;

		printTree(start.left);
		System.out.println(start.data);
		printTree(start.right);
	}

}

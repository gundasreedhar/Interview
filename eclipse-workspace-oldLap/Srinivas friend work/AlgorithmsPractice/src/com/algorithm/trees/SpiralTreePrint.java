package com.algorithm.trees;

import java.util.Deque;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class SpiralTreePrint {
	static TreeNode start = null;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		printSpiral(root);
	}

	private static void printSpiral(TreeNode root) {

		Deque<TreeNode> deque = new LinkedBlockingDeque<>();
		Stack<TreeNode> st = new Stack<>();
		deque.addLast(root);
		int level = 0;
		TreeNode head = null;
		while (deque.size() > 0) {

			int size = deque.size();

			if ((level & 1) != 0) {

				while (size > 0) {
					TreeNode node = deque.removeFirst();
					st.push(node);
					if (node.left != null) {
						deque.push(node.left);
					}
					if (node.right != null) {
						deque.push(node.right);
					}

					size--;
				}

				level++;
			} else {

				while (size > 0) {

					TreeNode node = deque.removeLast();
					st.push(node);
					if (node.right != null) {
						deque.push(node.right);
					}
					if (node.left != null) {
						deque.push(node.left);
					}

					size--;
				}
				level++;
			}

		}

		while (!st.isEmpty()) {

			TreeNode node = st.pop();
			createSpiralDLL(node, head);
		}

	}

	private static void createSpiralDLL(TreeNode node, TreeNode head) {
		if (head == null) {
			head = node;
			start = node;
			return;
		}

		node.right = head;
		head.left = node;
		head = node;
	}

}

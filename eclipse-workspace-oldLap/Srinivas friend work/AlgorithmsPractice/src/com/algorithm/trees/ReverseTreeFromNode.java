package com.algorithm.trees;

import java.util.*;

public class ReverseTreeFromNode {

	static int st = 0;

	public static void main(String args[]) {

		CustomTreeNode root = new CustomTreeNode(1);
		root.left = new CustomTreeNode(2);
		root.right = new CustomTreeNode(3);
		root.left.left = new CustomTreeNode(4);
		root.left.right = new CustomTreeNode(5);
		root.right.left = new CustomTreeNode(6);
		root.right.right = new CustomTreeNode(7);
		root.left.left.left = new CustomTreeNode(8);
		root.left.left.right = new CustomTreeNode(9);

		Map<Integer, Integer> map = new HashMap();
		int data = 9;
		reverseFromNode(root, data, 0, map);

		System.out.println("InOrder Traversal ");
		traverseInOrder(root);

	}

	static boolean reverseFromNode(CustomTreeNode root, int data, int level, Map<Integer, Integer> map) {

		if (root == null)
			return false;

		map.put(level, root.data);

		if ((root.data == data) || reverseFromNode(root.left, data, level + 1, map)
				|| reverseFromNode(root.right, data, level + 1, map)) {

			root.data = map.get(st++);
			return true;
		}

		return false;

	}

	static void traverseInOrder(CustomTreeNode root) {

		if (root == null)
			return;

		traverseInOrder(root.left);
		System.out.println(root.data);
		traverseInOrder(root.right);

	}
}
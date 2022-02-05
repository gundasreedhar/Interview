package com.algorithm.trees;

public class TreeCreateUsingPreOrderAndMirrorPreOrder {

	static int index = 0;

	public static void main(String args[]) {

		int preOrder[] = { 1, 2, 4, 5, 3, 6, 7 };
		int preOrderMirror[] = { 1, 3, 7, 6, 2, 5, 4 };

		int n = preOrder.length;
		TreeNode root = constructTree(preOrder, preOrderMirror, 0, n - 1, n);

		printInOrder(root);
	}

	private static void printInOrder(TreeNode root) {

		if (root == null)
			return;

		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);
	}

	static TreeNode constructTree(int[] preOrder, int[] preOrderMirror, int l, int h, int n) {

		if (index >= n || (l > h))
			return null;

		TreeNode root = new TreeNode(preOrder[index]);
		index++;

		if (l == h)
			return root;

		int searchIndex = search(preOrderMirror, l, h, preOrder[index]);

		if (searchIndex < n) {
			root.left = constructTree(preOrder, preOrderMirror, searchIndex, h, n);
			root.right = constructTree(preOrder, preOrderMirror, l + 1, searchIndex - 1, n);
		}

		return root;

	}

	static int search(int preOrderMirror[], int l, int h, int data) {

		for (int i = l; i <= h; i++) {
			if (preOrderMirror[i] == data) {
				return i;
			}
		}
		return -1;
	}

}
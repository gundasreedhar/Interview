package com.algorithm.trees;

public class PrePostInTraversal {

	private static int index = 0;

	public static void main(String args[]) {

		int inorder[] = { 4, 2, 5, 1, 3 };
		int preOrder[] = { 1, 2, 4, 5, 3 };
		int postOrder[] = { 4, 5, 2, 3, 1 };
		int start = 0;
		int end = inorder.length - 1;
		TreeNode root = constructTreeUsingInOrderAndPreOrder(inorder, preOrder, start, end);

		int len = checkWhetherGivenPostOrderIsSameAsCalculatedRoot(root, postOrder, 0);
		if (len == inorder.length) {
			System.out.println("Yes");
		}

		else {
			System.out.print("No");
		}

	}

	static TreeNode constructTreeUsingInOrderAndPreOrder(int inOrder[], int preOrder[], int start, int end) {

		if (start > end) {
			return null;
		}

		TreeNode root = new TreeNode(preOrder[index++]);

		if (start == end) {
			return root;
		}
		int index = search(inOrder, preOrder, start, end, root.data);

		root.left = constructTreeUsingInOrderAndPreOrder(inOrder, preOrder, start, index - 1);
		root.right = constructTreeUsingInOrderAndPreOrder(inOrder, preOrder, index + 1, end);

		return root;

	}

	static int search(int inOrder[], int preOrder[], int start, int end, int data) {

		for (int i = start; i <= end; i++) {
			if (inOrder[i] == data)
				return i;
		}
		return -1;

	}

	static int checkWhetherGivenPostOrderIsSameAsCalculatedRoot(TreeNode root, int[] postOrder, int indexT) {

		if (root == null)
			return indexT;

		indexT = checkWhetherGivenPostOrderIsSameAsCalculatedRoot(root.left, postOrder, indexT);
		indexT = checkWhetherGivenPostOrderIsSameAsCalculatedRoot(root.right, postOrder, indexT);
		if (root.data == postOrder[indexT])
			indexT++;
		else
			return 0;

		return indexT;

	}

}

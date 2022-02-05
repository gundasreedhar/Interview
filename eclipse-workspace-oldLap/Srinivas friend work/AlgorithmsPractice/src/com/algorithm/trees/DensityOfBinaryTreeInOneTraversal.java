package com.algorithm.trees;

public class DensityOfBinaryTreeInOneTraversal {
	private static int size = 0;

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(6);

		int height = findHeightAndComputeSize(root);

		int density = size / height;

		System.out.println("Height of tree is " + height);
		System.out.println("size  of tree is " + size);
		System.out.println("Density  is  " + density);

	}

	private static int findHeightAndComputeSize(TreeNode root) {

		if (root == null)
			return 0;

		int leftHeight = findHeightAndComputeSize(root.left);
		int rightHeight = findHeightAndComputeSize(root.right);

		size++;

		int height = 0;
		if (leftHeight > rightHeight)
			height = leftHeight+1;
		else
			height = rightHeight+1;

		return height;
	}

}

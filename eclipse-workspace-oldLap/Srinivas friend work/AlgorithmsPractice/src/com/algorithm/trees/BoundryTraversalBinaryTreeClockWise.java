package com.algorithm.trees;

public class BoundryTraversalBinaryTreeClockWise {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(8);
		root.right = new TreeNode(22);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(12);
		root.right.right = new TreeNode(25);
		root.left.right.left = new TreeNode(10);
		root.left.right.right = new TreeNode(14);

		boundaryTraversal(root);
	}

	private static void boundaryTraversal(TreeNode root) {
		if (root != null) {

			System.out.print(root.data + " ");
			boundaryRightTraversal(root.right);
			leaveTraverse(root.right);
			leaveTraverse(root.left);
			boundaryLeftTraverse(root.left);

		}

	}

	private static void boundaryLeftTraverse(TreeNode root) {
		if (root != null) {
			if (root.left != null) {
				boundaryLeftTraverse(root.left);
				System.out.print(root.data + " ");
			} else if (root.right != null) {
				boundaryLeftTraverse(root.right);
				System.out.print(root.right + " ");
			}

		}

	}

	private static void leaveTraverse(TreeNode root) {
		if (root != null) {
			leaveTraverse(root.right);
			if (root.left == null && root.right == null) {
				System.out.print(root.data + " ");
			}
			leaveTraverse(root.left);
		}

	}

	private static void boundaryRightTraversal(TreeNode root) {
		if (root != null) {
			if (root.right != null) {
				System.out.print(root.data + " ");
				boundaryRightTraversal(root.right);
			} else if (root.left != null) {
				System.out.print(root.data + " ");
				boundaryRightTraversal(root.left);
			}
		}

	}

}

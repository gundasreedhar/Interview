package com.algorithm.trees;

class InOrderTraversalUsingThreadedBST {

	public static void main(String args[]) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		inOrderUsingThreadedBST(root);

	}

	private static void inOrderUsingThreadedBST(TreeNode root) {

		while (root != null) {

			if (root.left == null) {
				System.out.println(root.data);
				root = root.right;
			}

			else {

				TreeNode predecessor = root.left;
				while ((predecessor.right != null) && (predecessor.right != root)) {
					predecessor = predecessor.right;
				}

				if (predecessor.right == null) {
					predecessor.right = root;
					root = root.left;
				}

				else {
					predecessor.right = null;
					System.out.println(root.data);
					root = root.right;

				}

			}

		}
	}

}

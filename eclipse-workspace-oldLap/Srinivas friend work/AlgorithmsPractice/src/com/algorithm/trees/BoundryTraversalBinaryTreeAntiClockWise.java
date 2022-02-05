package com.algorithm.trees;

public class BoundryTraversalBinaryTreeAntiClockWise {

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

	static void boundaryTraversal(TreeNode root) {

		if (root != null) {
			System.out.print(root.data + " ");
			boudaryLeftTraverse(root.left);
			leaveTraverse(root.left);
			leaveTraverse(root.right);
            boundaryRightTraverse(root.right);
		}

	}

	private static void boundaryRightTraverse(TreeNode root) {
	    if(root != null){
	    	if(root.right != null){
	    		boundaryRightTraverse(root.right);
	    		System.out.print(root.data + " ");
	    	}
	    	else if(root.left != null){
	    		boundaryRightTraverse(root.left);
	    		System.out.print(root.data + " ");
	    	}
	    	 
	    }
		
	}

	private static void leaveTraverse(TreeNode root) {
		if (root != null) {
			leaveTraverse(root.left);
			if (root.left == null && root.right == null) {
				System.out.print(root.data + " ");
			}
			leaveTraverse(root.right);
		}

	}

	private static void boudaryLeftTraverse(TreeNode root) {
		if (root != null) {
			if (root.left != null) {
				System.out.print(root.data + " ");
				boudaryLeftTraverse(root.left);
			} else if (root.right != null) {
				System.out.print(root.data + " ");
				boudaryLeftTraverse(root.right);
			}

		}

	}

}

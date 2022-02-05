package com.algorithm.trees;

import java.util.*;

public class BinaryTreeDLL {

	public static void main(String args[]) {

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(12);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(25);
		root.left.right = new TreeNode(30);
		root.right.left = new TreeNode(36);

		printDLLFromTree(root);

	}

	public static void printDLLFromTree(TreeNode root) {
		TreeNode prev = null;
		Stack<TreeNode> stack = new Stack();
	

		while (root != null) {
			stack.push(root);
			root = root.left;
		}

		TreeNode start = stack.peek();
		while (!stack.isEmpty()) {

			TreeNode node = stack.pop();
			if (prev == null) {
				prev = node;
			}

			else {
				prev.right = node;
				node.left = prev;
				prev = node;
			}

			TreeNode rightNode = node.right;
			if (rightNode != null) {

				while (rightNode != null) {
					stack.push(rightNode);
					rightNode = rightNode.left;
				}

			}

		}

		prev.right = start;
		start.left = prev;
		
		//printTree(start);

	}

	private static void printTree(TreeNode start) {
		 while(start != null){
			 
			 System.out.println(start.data);
			 start = start.right;
			 
		 }
		
	}
	
	
	
	
}
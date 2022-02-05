package com.algorithm.trees;

public class InOrderPredecessorPrint {
	static CustomTreeNode prev = null;

	public static void main(String[] args) {
		CustomTreeNode customTreeNode = new CustomTreeNode(1);
		customTreeNode.left = new CustomTreeNode(2);
		customTreeNode.right = new CustomTreeNode(3);
		customTreeNode.left.left = new CustomTreeNode(4);
		customTreeNode.left.right = new CustomTreeNode(5);
		customTreeNode.right.left = new CustomTreeNode(6);
		customTreeNode.right.right = new CustomTreeNode(7);

		CustomTreeNode temp = customTreeNode;
		preOrderLinkCreation(temp);
		traversePredecessor(customTreeNode);

	}

	private static void traversePredecessor(CustomTreeNode customTreeNode) {
		while (customTreeNode.right != null) {
			customTreeNode = customTreeNode.right;
		}

		while (customTreeNode != null) {
			System.out.print(customTreeNode.data + "has prev of ");
			if (customTreeNode.prev == null) {
				System.out.print(" null ");
			} else {
				System.out.print(customTreeNode.prev.data);
			}
			System.out.println(" ");
			
			customTreeNode = customTreeNode.prev;
		}
	}

	private static void preOrderLinkCreation(CustomTreeNode temp) {

		if (temp != null) {

			preOrderLinkCreation(temp.left);
			temp.prev = prev;
			prev = temp;
			preOrderLinkCreation(temp.right);

		}

	}

}

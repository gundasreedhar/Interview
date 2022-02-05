package com.algorithm.trees;

public class InOrderSuccessorPrintType2 {
	static CustomTreeNode next = null;

	public static void main(String[] args) {

		CustomTreeNode customTreeNode = new CustomTreeNode(1);
		customTreeNode = new CustomTreeNode(1);
		customTreeNode.left = new CustomTreeNode(2);
		customTreeNode.right = new CustomTreeNode(3);
		customTreeNode.left.left = new CustomTreeNode(4);
		customTreeNode.left.right = new CustomTreeNode(5);
		customTreeNode.right.left = new CustomTreeNode(6);
		customTreeNode.right.right = new CustomTreeNode(7);

		CustomTreeNode temp = customTreeNode;
		inOrderSuccessor(temp);
		traverseSuccessorData(customTreeNode);

	}

	private static void traverseSuccessorData(CustomTreeNode customTreeNode) {
		while (customTreeNode.right != null) {
			customTreeNode = customTreeNode.left;
		}
		
		while(customTreeNode != null){
			System.out.print(customTreeNode.data + " has next of ");
			if (customTreeNode.next == null) {
				System.out.print(" null ");
			} else {
				System.out.print(customTreeNode.next.data);
			}

			System.out.println(" ");
			customTreeNode = customTreeNode.next;
		}

	}

	private static void inOrderSuccessor(CustomTreeNode customTreeNode) {
		if (customTreeNode != null) {

			inOrderSuccessor(customTreeNode.right);
			customTreeNode.next = next;
			next = customTreeNode;
			inOrderSuccessor(customTreeNode.left);

		}

	}

}

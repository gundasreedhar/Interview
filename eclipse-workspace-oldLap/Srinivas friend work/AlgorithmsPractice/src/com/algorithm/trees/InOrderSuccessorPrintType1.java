
package com.algorithm.trees;

import java.util.ArrayList;
import java.util.List;

public class InOrderSuccessorPrintType1 {

	public static void main(String[] args) {
		CustomTreeNode customTreeNode = new CustomTreeNode(1);
		customTreeNode.left = new CustomTreeNode(2);
		customTreeNode.right = new CustomTreeNode(3);
		customTreeNode.left.left = new CustomTreeNode(4);
		customTreeNode.left.right = new CustomTreeNode(5);
		customTreeNode.right.left = new CustomTreeNode(6);
		customTreeNode.right.right = new CustomTreeNode(7);

		List<CustomTreeNode> customList = new ArrayList();
		CustomTreeNode temp = customTreeNode;
		populateList(temp, customList);

		linkNextPointers(customList, customTreeNode);

	}

	private static void linkNextPointers(List<CustomTreeNode> customList, CustomTreeNode customTreeNode) {
		int prev = 0;
		for (int i = 1; i < customList.size() && prev < customList.size() - 1; i++) {
			customList.get(prev).next = customList.get(i);
			prev++;

		}

		printNextNodes(customTreeNode);

	}

	private static void printNextNodes(CustomTreeNode customTreeNode) {

		while (customTreeNode.left != null) {
			customTreeNode = customTreeNode.left;
		}

		while (customTreeNode != null) {
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

	public static void populateList(CustomTreeNode root, List<CustomTreeNode> customList) {

		if (root == null)
			return;

		populateList(root.left, customList);
		customList.add(root);
		populateList(root.right, customList);

	}

}

class CustomTreeNode {
	CustomTreeNode next;
	CustomTreeNode prev;
	CustomTreeNode left;
	CustomTreeNode right;
	int data;

	CustomTreeNode(int data) {
		this.data = data;
	}

}
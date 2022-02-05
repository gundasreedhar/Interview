package com.algorithm.trees;

public class InOrderSuccessorOfParticularNode {

	static CustomTreeNode temp = null;

	public static void main(String[] args) {
		CustomTreeNode customTreeNode = new CustomTreeNode(1);
		customTreeNode.left = new CustomTreeNode(2);
		customTreeNode.right = new CustomTreeNode(3);
		customTreeNode.left.left = new CustomTreeNode(4);
		customTreeNode.left.right = new CustomTreeNode(5);
		customTreeNode.right.left = new CustomTreeNode(6);
		customTreeNode.right.right = new CustomTreeNode(7);

		CustomTreeNode x1 = customTreeNode.left.right;
		findInOrderSuccessorFor(customTreeNode, x1);

	}

	private static void findInOrderSuccessorFor(CustomTreeNode customTreeNode, CustomTreeNode x) {
		if (x.right != null) {

			CustomTreeNode leftMostNode = findLeftMostNode(x);
			System.out.println("Successor of " + x.data + " is " + leftMostNode.data);

		}

		else {

			CustomTreeNode tempCustom = customTreeNode;
			CustomTreeNode rightMostNode = findRightMostNode(tempCustom);

			if (rightMostNode.data == x.data) {
				System.out.println("Inoerder successor not possible for x : " + x.data);
			}

			else {

				recursiveSuccessorCheck(customTreeNode, x);
			}

		}

	}

	private static CustomTreeNode recursiveSuccessorCheck(CustomTreeNode root, CustomTreeNode x) {

		if (root == null)
			return null;

		temp = recursiveSuccessorCheck(root.left, x);
		if (temp == null) {
			temp = recursiveSuccessorCheck(root.right, x);
		}

		if (x.data == root.data || temp != null) {
			if (root.left == temp && temp != null) {
				System.out.println("Inorder successor found for " + x.data + " is " + root.data);
				return null;
			}

			return root;
		}

		return null;

	}

	private static CustomTreeNode findRightMostNode(CustomTreeNode x) {
		while (x != null && (x.right != null)) {
			x = x.right;
		}
		return x;
	}

	private static CustomTreeNode findLeftMostNode(CustomTreeNode x) {
		while (x != null && (x.left != null)) {
			x = x.left;
		}
		return x;
	}

}

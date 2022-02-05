package com.algorithm.trees;

public class TraversalTrees {

	public static void main(String args[]) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);

		System.out.println("Inorder >>>>  ");
		printInorder(root);
		System.out.println("Preorder >>>>  ");
		printPreOrder(root);
		System.out.println("Postorder >>>>  ");
		printPostOrder(root);

	}

	private static void printPostOrder(Node root) {
		if (root == null)
			return;
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.println(root.data);

	}

	private static void printPreOrder(Node root) {
		if (root == null)
			return;

		System.out.println(root.data);
		printPreOrder(root.left);
		printPreOrder(root.right);

	}

	static void printInorder(Node node) {
		if (node == null)
			return;

		printInorder(node.left);
		System.out.println(node.data);
		printInorder(node.right);

	}

}

class Node {

	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
	}

	int getNumber() {
		return data;
	}

}

package com.dynamicProgramming;

public class PrintNodeFromEnd {
	public static void main(String[] args) {

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);

		printNode(node);
	}

	private static void printNode(Node node) {

		if (node == null)
			return;
		printNode(node.next);
		System.out.println(node.data);
	}

}

package com.dynamicProgramming;

public class ImplementStackUsingLinkedList {

	private static Node node;

	public static void main(String[] args) {

		push(1);
		push(2);
		push(3);
		pop();
		pop();
		pop();
		pop();
	}

	static void push(int data) {
		if (node == null) {
			node = new Node(data);
			return;
		}

		Node tempNode = node;
		while (tempNode != null && tempNode.next != null) {
			tempNode = tempNode.next;
		}

		tempNode.next = new Node(data);
	}

	static void pop() {

		if (node == null) {
			System.out.println("Already empty Stack ");
			return;
		}

		if (node.next == null) {
			node = null;
			return;
		}

		Node tempNode = node;
		Node prev = null;
		while (tempNode.next != null) {
			prev = tempNode;
			tempNode = tempNode.next;
		}

		if (prev != null)
			prev.next = null;

	}
}

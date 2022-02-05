package com.dynamicProgramming;

public class ReverseLinkedList {

	public static void main(String args[]) {

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);

		Node current = node;
		Node res = recursiveSolution(null,current);
		while (res != null) {
			System.out.println(res.data);
			res = res.next;
		}

	}

	private static Node recursiveSolution(Node prev, Node current) {

		if (current == null) {
			return prev;
		}

		Node next = current.next;
		current.next = prev;

		return recursiveSolution(current, next);

	}

	private static Node reverseLinkedList(Node node) {

		Node prev = null;
		Node current = node;
		while (current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		return prev;
	}
}
package com.dynamicProgramming;

public class MiddleElementinLinkedList {
	public static void main(String args[]) {

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);

		findMiddle(node);

		Node node1 = new Node(1);
		node1.next = new Node(2);
		node1.next.next = new Node(3);
		node1.next.next.next = new Node(4);
		node1.next.next.next.next = new Node(5);
		node1.next.next.next.next.next = new Node(6);
		
		findMiddle(node1);

	}

	private static void findMiddle(Node node) {

		Node nodeTemp = node;
		Node slow = nodeTemp;
		Node fast = nodeTemp;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}

		System.out.println("Middle element found  " + slow.data);
	}
}
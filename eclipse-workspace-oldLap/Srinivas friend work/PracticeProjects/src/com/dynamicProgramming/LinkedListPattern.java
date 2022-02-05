package com.dynamicProgramming;

public class LinkedListPattern {

	public static void main(String args[]) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);

		patternFinder(node);

	}

	private static void patternFinder(Node node) {

		Node head = node;
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node slowNext = slow.next;
		slow.next = null;

		Node reverseNode = reverseOtherHalf(slowNext);

		Node startNode = mergeNodes(head, reverseNode);

		while (startNode != null) {
			System.out.println(startNode.data);
			startNode = startNode.next;
		}
	}

	private static Node reverseOtherHalf(Node node) {
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

	private static Node mergeNodes(Node head, Node reverse) {

		Node start = head;
		Node startTemp = start;

		while (start != null && reverse != null) {
			Node startNext = start.next;
			Node reverseNext = reverse.next;
			start.next = reverse;
			reverse.next = startNext;
			start = startNext;
			reverse = reverseNext;
		}

		return startTemp;

	}

}
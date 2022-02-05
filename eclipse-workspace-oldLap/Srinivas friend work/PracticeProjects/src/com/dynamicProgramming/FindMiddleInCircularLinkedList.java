package com.dynamicProgramming;

public class FindMiddleInCircularLinkedList {

	public static void main(String args[]) {

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = node;

		findMiddle(node);

	}

	private static void findMiddle(Node head) {

		Node slow = head;
		Node fast = head;

		while (fast.next != head && fast.next.next != head) {

			slow = slow.next;
			fast = fast.next.next;
		}

		if (fast.next.next == head) {
			fast = fast.next;
		}

		Node head1 = head;

		Node head2 = slow.next;
		slow.next = head1;

		fast.next = head2;

	}

}
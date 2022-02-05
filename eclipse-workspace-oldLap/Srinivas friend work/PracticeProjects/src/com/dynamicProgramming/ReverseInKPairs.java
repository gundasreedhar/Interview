package com.dynamicProgramming;

import java.util.Scanner;

public class ReverseInKPairs {

	public static void main(String args[]) {

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(6);
		node.next.next.next.next.next.next = new Node(7);
		node.next.next.next.next.next.next.next = new Node(8);
		node.next.next.next.next.next.next.next.next = new Node(9);
		node.next.next.next.next.next.next.next.next.next = new Node(10);

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		Node tempNode1 = node;
		Node tempNode2 = node;
		// Node resNode = reverseRecursive(tempNode1, k);

		Node resNode2 = reverseIterative(tempNode2, k);

		// System.out.println("resNode " + resNode);
	}

	private static Node reverseIterative(Node node, int k) {
		Node prevTail = null;
		Node prevHead = null;
		Node head = node;
		Node current = head;
		int counter = k;
		Node prev = null;
		Node next = null;
		Node prevCurrent = head;

		while (current != null) {
			prev = null;
			counter = k;
			while (current != null && counter > 0) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
				counter--;
			}

			if (prevTail != null) {
				prevTail.next = prev;
			} else {
				head = prev;
			}

			prevTail = prevCurrent;
			prevCurrent = current;
		}

		// TODO Auto-generated method stub
		return head;
	}

	private static Node reverseRecursive(Node head, int k) {

		Node current = head;
		Node prev = null;
		Node next = null;
		int counter = k;
		while (current != null && counter > 0) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			counter--;
		}

		if (next != null)
			head.next = reverseRecursive(next, k);

		return prev;
	}

}
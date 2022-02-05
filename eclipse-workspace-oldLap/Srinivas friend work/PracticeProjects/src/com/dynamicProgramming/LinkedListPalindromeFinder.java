package com.dynamicProgramming;

public class LinkedListPalindromeFinder {

	public static void main(String[] args) {
	
	  Node node = new Node(1);
	  node.next = new Node(2);
	  node.next.next = new Node(3);
	  node.next.next.next = new Node(4);
	  node.next.next.next.next = new Node(3);
	  node.next.next.next.next.next = new Node(2);
	  node.next.next.next.next.next.next = new Node(1);


      boolean isPalindrome = palindromeFinder(node);	  
	  
	  System.out.println("Is Palindrome :  "  + isPalindrome);
	}

	private static boolean palindromeFinder(Node node) {

		Node current = node;
		Node slow = current;
		Node fast = current;
		Node prev = null;

		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		if (fast != null) {
			slow = slow.next;
		}

		prev.next = null;

		Node reverse = reverseNode(slow);

		boolean compareNodes = compareNodes(current, reverse);

		return compareNodes;

	}

	private static Node reverseNode(Node head) {

		Node current = head;
		Node prev = null;
		while (current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;

	}

	private static boolean compareNodes(Node current, Node reverse) {

		while (current != null && reverse != null) {
			if (current.data != reverse.data) {
				return false;
			}

			current= current.next;
			reverse = reverse.next;
		}
		if (current != null || reverse != null)
			return false;

		return true;

	}

}

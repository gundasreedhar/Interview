package com.dynamicProgramming;

public class MergeTwoSortedLinkedLists {

	public static void main(String args[]) {

		Node node1 = new Node(1);
		node1.next = new Node(2);
		node1.next.next = new Node(4);

		Node node2 = new Node(3);
		node2.next = new Node(5);
		node2.next.next = new Node(6);
		node2.next.next.next = new Node(7);

		//Node node = mergeRecursively(node1, node2);
		
		Node node = mergeLooping(node1, node2);
		while(node != null){
			System.out.println(node.data);
			node = node.next;
		}
		

	}

	private static Node mergeRecursively(Node node1, Node node2) {
		Node head = new Node(0);
		if (node1 == null)
			return node2;
		if (node2 == null)
			return node1;

		if (node1.data <= node2.data) {
			head = node1;
			head.next = mergeRecursively(node1.next, node2);
		}

		else if (node2.data <= node1.data) {
			head = node2;
			head.next = mergeRecursively(node1, node2.next);
		}

		return head;
	}

	private static Node mergeLooping(Node node1, Node node2) {

		Node head = new Node(0);
		Node current = head;

		while (node1 != null && node2 != null) {

			if (node1.data <= node2.data) {
				current.next = node1;
				node1 = node1.next;
			}

			else if (node2.data <= node1.data) {
				current.next = node2;
				node2 = node2.next;
			}

			current = current.next;
		}

		if (node1 == null)
			current.next = node2;

		if (node2 == null)
			current.next = node1;

		return head.next;
	}

}
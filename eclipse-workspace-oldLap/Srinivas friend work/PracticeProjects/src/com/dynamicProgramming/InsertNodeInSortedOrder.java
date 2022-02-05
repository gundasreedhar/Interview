package com.dynamicProgramming;

import java.util.Scanner;

public class InsertNodeInSortedOrder {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node head = null;
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			head = insertNodeInSortedOrder(head, m);
		}
		
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
	}

	private static Node insertNodeInSortedOrder(Node head, int data) {

		if (head == null) {
			head = new Node(data);
		}

		else if (data < head.data) {
			Node node = new Node(data);
			node.next = head;
			head = node;
		}

		else {
			Node node = new Node(data);
			Node prev = null;
			while (head != null && node.data > head.data) {
				prev = head;
				head = head.next;
			}

			prev.next = node;
			if (head != null) {
				node.next = head;
			}
			head = prev;
		}

		return head;
	}

}
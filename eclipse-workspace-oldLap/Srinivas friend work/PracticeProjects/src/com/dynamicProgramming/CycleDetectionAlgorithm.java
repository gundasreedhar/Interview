package com.dynamicProgramming;

public class CycleDetectionAlgorithm {

	public static void main(String[] args) {

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(6);
		node.next.next.next.next.next.next = new Node(7);
		node.next.next.next.next.next.next.next = new Node(8);
		node.next.next.next.next.next.next.next.next = new Node(9);
		node.next.next.next.next.next.next.next.next.next = node.next.next.next.next;

		detectCycle(node);

	}

	private static void detectCycle(Node node) {

		Node head = node;
		if (node == null) {
			System.out.println("Node not present ");
		}

		Node slow = node;
		Node fast = node;
		boolean cycleDetected = false;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow.data == fast.data) {
				cycleDetected = true;
				System.out.println("cycle found !!  ");
				break;

			}
		}

		if (!cycleDetected) {
			System.out.println("cycle not found !! ");
		}

		if (cycleDetected) {
			slow = head;
			while (slow.data != fast.data) {
				slow = slow.next;
				fast = fast.next;
			}

			System.out.println("starting cycle node data is " + slow.data);

			fast = fast.next;
			int count = 1;
			while (slow.data != fast.data) {
				count = count + 1;
				fast = fast.next;
			}
			
			System.out.println("Cycle length is " +  count);
		}
	}
}

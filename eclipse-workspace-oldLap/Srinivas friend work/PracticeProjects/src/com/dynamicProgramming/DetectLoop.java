package com.dynamicProgramming;

//Using Floyds Technique
public class DetectLoop {

	public static void main(String args[]) {

		Node node1 = new Node(1);
		node1.next = new Node(2);
		node1.next.next = new Node(3);
		node1.next.next.next = new Node(4);
		node1.next.next.next.next = new Node(5);
		node1.next.next.next.next.next = new Node(6);
		node1.next.next.next.next.next.next = new Node(7);
		node1.next.next.next.next.next.next.next = new Node(8);
		node1.next.next.next.next.next.next.next.next = new Node(9);
		node1.next.next.next.next.next.next.next.next.next = new Node(10);
		node1.next.next.next.next.next.next.next.next.next.next = node1.next.next.next.next;

		detectCycleAndFindStartNodeOfCycleAndLengthOfLoop(node1);

	}

	private static void detectCycleAndFindStartNodeOfCycleAndLengthOfLoop(Node node1) {

		Node head = node1;

		Node slowNode = head;
		Node fastNode = head;

		boolean loopDetected = false;

		while (fastNode != null && fastNode.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;

			if (slowNode.data == fastNode.data) {
				System.out.println("Loop Detected !! ");
				loopDetected = true;
				break;
			}
		}

		if (loopDetected) {

			Node slowNodeTemp = slowNode.next;
			Node fastNodeTemp = fastNode;
			int counter = 0;
			while (slowNodeTemp.data != fastNodeTemp.data) {
				counter++;
				slowNodeTemp = slowNodeTemp.next;
				fastNodeTemp = fastNode.next;
			}

			System.out.println("Loop length is " + counter);

			slowNode = head;
			while (slowNode.data != fastNode.data) {
				slowNode = slowNode.next;
				fastNode = fastNode.next;
			}

			System.out.println("Loop Node found is " + slowNode.data);
		}

	}
}
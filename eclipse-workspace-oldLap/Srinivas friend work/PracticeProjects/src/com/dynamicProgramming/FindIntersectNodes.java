package com.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FindIntersectNodes {

	public static void main(String args[]) {

		Node node1 = new Node(5);
		node1.next = new Node(6);
		node1.next.next = new Node(1);
		node1.next.next.next = new Node(2);

		Node node2 = new Node(7);
		node2.next = new Node(8);
		node2.next.next = new Node(9);
		node2.next.next.next = new Node(1);
		node2.next.next.next.next = new Node(2);

		findInntersectUsingHashTable(node1, node2);

		findIntersectingNodesUsingStack(node1, node2);

		findIntersectNodesUsingLengthCriteria(node1, node2);
	}

	private static void findIntersectNodesUsingLengthCriteria(Node node1, Node node2) {
		int node1Length = 0;
		int node2Length = 0;
		Node node1Temp = node1;
		Node node2Temp = node2;
		while (node1Temp != null) {
			node1Length++;
			node1Temp = node1Temp.next;
		}

		while (node2Temp != null) {
			node2Length++;
			node2Temp = node2Temp.next;
		}

		int d = 0;
		if (node1Length > node2Length) {
			d = node1Length - node2Length;
		} else if (node2Length > node1Length) {
			d = node2Length - node1Length;
			Node tempNode = node1;
			node1 = node2;
			node2 = tempNode;
		}
		
		

		for (int i = 0; i < d; i++) {
			node1 = node1.next;
		}

		while (node1 != null && node2 != null) {
			if (node1.data == node2.data) {
				System.out.println(" Intersection in lebgth soln found at " + node1.data);
				break;
			}
			node1 = node1.next;
			node2 = node2.next;
		}
	}

	private static void findIntersectingNodesUsingStack(Node node1, Node node2) {
		Stack<Node> stackForNode1 = new Stack<>();
		Stack<Node> stackForNode2 = new Stack<>();

		while (node1 != null) {
			stackForNode1.add(node1);
			node1 = node1.next;
		}

		while (node2 != null) {
			stackForNode2.add(node2);
			node2 = node2.next;
		}
		Node prev = null;
		while (!stackForNode1.isEmpty() && !stackForNode2.isEmpty()) {
			Node node1Temp = stackForNode1.pop();
			int data1 = node1Temp.data;
			Node node2Temp = stackForNode2.pop();
			int data2 = node2Temp.data;
			if (data1 == data2)
				prev = node1Temp;
			else
				break;

		}

		if (prev != null) {
			System.out.println("Intersection in stack solution Found at " + prev.data);
		}
		// TODO Auto-generated method stub

	}

	private static void findInntersectUsingHashTable(Node node1, Node node2) {

		Map<Integer, Boolean> nodePresentMap = new HashMap();
		Node node1Temp = node1;
		while (node1Temp != null) {
			nodePresentMap.put(node1Temp.data, true);
			node1Temp = node1Temp.next;
		}

		Node node2Temp = node2;
		while (node2Temp != null) {
			if (nodePresentMap.containsKey(node2Temp.data)) {
				System.out.println("Intersection in hashtable solution Found at " + node2Temp.data);
				break;
			}
			node2Temp = node2Temp.next;
		}

	}

}
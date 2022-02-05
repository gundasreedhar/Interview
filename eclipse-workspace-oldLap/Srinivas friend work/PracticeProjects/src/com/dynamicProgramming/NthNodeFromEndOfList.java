package com.dynamicProgramming;

import java.util.*;

public class NthNodeFromEndOfList {

	public static void main(String args[]) {

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		Node node10 = new Node(10);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		Node resultNode = getNthNodeFromEnd(node1, m);
		System.out.println("resultNode data is " + resultNode.data);

	}

	static Node getNthNodeFromEnd(Node head, int m) {

		  Node tempNode = head;
		  int count = 1;
		while(tempNode != null && count <m){
			count = count+1;
			  tempNode = tempNode.next;
		}
		
		
		Node destinationNode = null;
		while(tempNode != null){
			if(destinationNode == null)
			{
				destinationNode = head;
			}
			
			else {
				destinationNode  = destinationNode.next;
			}
			
			tempNode = tempNode.next;
			
		}
		
		
		return destinationNode;
		
		
		
	}

}



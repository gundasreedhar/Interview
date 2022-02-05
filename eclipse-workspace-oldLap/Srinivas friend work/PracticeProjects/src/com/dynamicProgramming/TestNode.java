package com.dynamicProgramming;

public class TestNode {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node current  = new Node(2);
		
		head = current;
		
		current.next = new Node(3);
		current.next.next = new Node(4);
		
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
		
		System.out.println("?>>>>>>>>>>> ");
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
		
	}
}

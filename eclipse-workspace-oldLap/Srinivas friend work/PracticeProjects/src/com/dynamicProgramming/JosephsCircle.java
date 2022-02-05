package com.dynamicProgramming;

import java.util.Scanner;

public class JosephsCircle {

	public static void main(String args[]) {
		 Node node = checkDataSetOne();

		//Node node = checkDataSet2();
		Scanner sc = new Scanner(System.in);
		// for dataset2 : k =2 and dataset1 k=3
		int k = sc.nextInt();

		//computeJosephsCircle(node, k);
		int n = 7;
		int m = 3;
		computeJosephUsingAnotherMethod(n,m);
	}

	private static void computeJosephUsingAnotherMethod(int n, int m) {

		Node p= new Node(1);
		Node q = null;
	    q = p;
	    
	    for(int i=2;i<=n;i++){
	    	 Node nodeTemp = new Node(i);
	    	 p.next = nodeTemp;
	    	 p = p.next;
	    	
	    }
	    
	    p.next = q;
	    
	    for(int count = n;count>1;--count){
	    	for(int i=0;i<m-1;++i){
	    		p = p.next;
	    	}
	    	p.next = p.next.next;
	    }
	  
	    System.out.println("Last player " + p.data);
	}

	private static Node checkDataSet2() {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = node;

		return node;
	}

	private static Node checkDataSetOne() {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(6);
		node.next.next.next.next.next.next = new Node(7);
		node.next.next.next.next.next.next.next = node;
		return node;
	}

	private static void computeJosephsCircle(Node current, int k) {
		int nc = 1;
		Node prev = null;
		Node next = null;
		while (current.data != current.next.data) {
			if (k - 1 == nc) {
				prev = current;
				next = current.next.next;
			}

			else if (k == nc) {
				prev.next = next;
				current = null;
				current = next;
				nc = 1;
				continue;
			}

			current = current.next;
			nc = nc + 1;
		}

		System.out.println("last remaining " + current.data);
	}
}

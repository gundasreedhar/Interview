package com.dynamicProgramming;

public class ReverseInPairs {

	public static void main(String args[]) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);

		//Node res = recurseReverse(node);
		
		Node res = loopedReverse(node);
		System.out.println(res);
	}

	private static Node loopedReverse(Node head) {
		Node temp1 = null;
		Node temp2 = null;
		
		while(head != null && head.next != null){
			
			if(temp1 != null)
				temp1.next.next = head.next; 
		    temp1 = head.next;
		    head.next = temp1.next;
		    temp1.next = head;
		    if(temp2 == null)
		    	temp2 = temp1;
		    head = head.next;
		    
		}
		// TODO Auto-generated method stub
		return temp2;
	}

	private static Node recurseReverse(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		else {
			Node temp = head.next;
			head.next = temp.next;
			temp.next = head;
			head = temp;

			head.next.next = recurseReverse(head.next.next);
			return head;

		}

	}

}
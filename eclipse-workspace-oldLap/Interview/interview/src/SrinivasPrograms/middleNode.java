package SrinivasPrograms;



public class middleNode {
	static Node head;

	static class Node {
		Node next;
		int data;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static public void main(String[] args) {
		middleNode md = new middleNode();
		md.head = new Node(10);
		Node sec = new Node(16);
		Node third = new Node(21);
		Node fourth = new Node(23);
		Node fifth = new Node(25);
		Node six = new Node(30);
		md.head.next = sec;
		md.head.next.next = third;
		md.head.next.next.next = fourth;
		md.head.next.next.next.next = fifth;
		md.head.next.next.next.next.next = six;
		md.print(head);
		Node head = md.reverse();
		System.out.println("\nReversed linked list ");
		md.print(head);
	}

	private static void getMiddleElement() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println("middle element " + slow.data);
	}

	Node reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	private void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}
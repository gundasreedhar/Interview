

class Node {
	int data;
	Node next;

	public Node(int key) {
		data = key;
		next = null;
	}

	public void displayNode() {
		System.out.println("item " + data);
	}
}

class LinkedList {
	Node first;

	public LinkedList() {
		first = null;
	}

	public void insert(int i) {
		Node newNode = new Node(i);
		newNode.next = first;
		first = newNode;
	}

	public Node delete() {
		Node temp;
		temp = first;
		first = first.next;
		return temp;
	}

	public void display() {
		System.out.println("Linkedlist ");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}
}

class stack {
	private LinkedList listobj;

	public stack() {
		listobj = new LinkedList();
	}

	public void push(int i) {
		listobj.insert(i);
	}

	public Node pop() {
		return listobj.delete();
	}

	public void displayStack() {
		System.out.println("stack :");
		listobj.display();
	}
}

public class ImplementStackUsingLinkedList {
	public static void main(String[] args) {
		stack demo = new stack();
		demo.push(10);
		demo.push(20);
		demo.push(30);
		demo.push(40);
		demo.push(50);
		demo.pop();
		demo.pop();
		demo.displayStack();
	}
}
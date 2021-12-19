package interview;

import java.util.Stack;

class StackUnderFlowException extends RuntimeException
{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "stack is empty..!!";
	}
}


class StackImpl {
	Node top = null;
	int size = 0;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public StackImpl push(StackImpl stack, int data) {
		Node node = new Node(data);
		if (isEmpty()) {// if stack is empty

			stack.top = node;
			size++;
		} else if (!isEmpty()) {// if stack is non-empty

			node.next = top;
			top = node;
			size++;
		}

		return stack;
	}

	public int pop() throws StackUnderFlowException {
		int data = -1;
		if (!isEmpty()) { // is stack is not empty
			data = top.data;
			top = top.next;
			size--;
			return data;
		} else if (isEmpty()) {
			// if stack is empty
			throw new StackUnderFlowException();
		}

		return data;
	}

	public int peek() {
		int data = 0;
		if (!isEmpty()) {
			data = top.data;
		} else if (isEmpty()) {
			throw new StackUnderFlowException();
		}
		return data;
	}

	public boolean isEmpty() {
		return top == null ? true : false;
	}

	public int size() {
		return size;
	}

	public void showAll() {
		Node dupeTop = top;
		while (dupeTop.next != null) {
			System.out.println(dupeTop.data);
			dupeTop = dupeTop.next;
		}
		System.out.println(dupeTop.data);
	}

}

public class StackUsingLinkedList {

	public static void main(String... args) {
		StackImpl stack = new StackImpl();
		stack = stack.push(stack, 1);
		stack = stack.push(stack, 2);
		System.out.println("size :" + stack.size());
		stack = stack.push(stack, 3);
		stack = stack.push(stack, 4);
		System.out.println("Elemernts in the stack are : \n");
		stack.showAll();
		System.out.println("size :" + stack.size());
		System.out.println("peeeking ------------: " + stack.peek());

		System.out.println("popping ----------->" + stack.pop());
		System.out.println("peeeking ------------: " + stack.peek());
		System.out.println("popping ----------->" + stack.pop());
		System.out.println("peeeking ------------: " + stack.peek());
		System.out.println("popping ----------->" + stack.pop());
		System.out.println("peeeking ------------: " + stack.peek());
		System.out.println("size :" + stack.size());
		System.out.println("is stack empty : " + stack.isEmpty());
		System.out.println("popping ----------->" + stack.pop());
		System.out.println("is stack empty : " + stack.isEmpty());
		try {
			System.out.println("peeeking ------------: " + stack.peek());
			System.out.println("popping ----------->" + stack.pop());
		} catch (StackUnderFlowException ex) {
			ex.printStackTrace();
		}
		System.out.println("size :" + stack.size());
		try {
			System.out.println(stack.pop());
		} catch (StackUnderFlowException ex) {
			ex.printStackTrace();
		}

		System.out.println("size :" + stack.size());

		System.out.println("is stack empty : " + stack.isEmpty());
	}

}

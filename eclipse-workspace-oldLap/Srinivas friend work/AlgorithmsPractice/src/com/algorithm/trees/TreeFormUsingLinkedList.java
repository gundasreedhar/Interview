package com.algorithm.trees;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TreeFormUsingLinkedList {
	public static void main(String[] args) {

		ListNode node = new ListNode(10);
		node.next = new ListNode(12);
		node.next.next = new ListNode(15);
		node.next.next.next = new ListNode(25);
		node.next.next.next.next = new ListNode(30);
		node.next.next.next.next.next = new ListNode(36);

		createTreeUsingLinkedList(node);

	}

	private static void createTreeUsingLinkedList(ListNode node) {

		TreeNode parent = null;
		ListNode head = node;
		Queue<TreeNode> queue = new LinkedBlockingQueue<>();
		TreeNode root = new TreeNode(head.data);
		queue.add(root);
		head = head.next;
		while (head != null) {

			parent = queue.poll();

			parent.left = new TreeNode(head.data);
			queue.add(parent.left);
			head = head.next;

			if (head != null) {

				parent.right = new TreeNode(head.data);
				queue.add(parent.right);
				head = head.next;

			}

		}

		printInOrder(root);
	}

	private static void printInOrder(TreeNode root) {
		if (root == null)
			return;

		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);

	}

}

class ListNode {
	int data;
	ListNode next;

	public ListNode(int data) {
		this.data = data;
	}
}

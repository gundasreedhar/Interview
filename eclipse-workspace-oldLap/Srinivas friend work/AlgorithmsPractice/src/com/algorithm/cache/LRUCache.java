package com.algorithm.cache;

import java.util.Map;

public class LRUCache {

	Map<Integer, Node> map;
	Node head = null;
	Node end = null;
	int capacity;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public void set(int key, int value) {
		if (map.containsKey(key)) {
			Node node = map.get(key);
			node.value = value;
			remove(node);
			setHead(node);
		}

		else {

			Node newNode = new Node(key, value);
			if (map.size() >= capacity) {
				map.remove(end.key);
				setHead(newNode);
			} else {
				setHead(newNode);
			}

			map.put(key, newNode);
		}

	}

	public int get(int key) {
		if (map.containsKey(key)) {
			Node node = map.get(key);
			remove(node);
			setHead(node);
			return node.value;
		}

		return -1;

	}

	private void setHead(Node node) {
		node.next = head;
		node.previous = null;
		if (head != null) {
			head.previous = node;
		}

		head = node;

		if (end == null) {
			end = head;
		}

	}

	private void remove(Node node) {
		if (node.previous != null) {
			node.previous.next = node.next;
		} else {
			head = node.next;
		}

		if (node.next != null) {
			node.next.previous = node.previous;
		} else {

			end = node.previous;
		}
	}

}

class Node {
	int key;
	int value;
	Node previous;
	Node next;

	Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
}
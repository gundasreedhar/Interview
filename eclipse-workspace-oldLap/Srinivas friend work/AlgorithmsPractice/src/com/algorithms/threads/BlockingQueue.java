package com.algorithms.threads;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue<T> {

	private List<T> queue = new LinkedList<T>();
	private int limit;

	BlockingQueue(int limit) {
		this.limit = limit;
	}

	public synchronized void enqueue(T item) throws InterruptedException {

		while (queue.size() == limit) {
			wait();
		}

		if (queue.size() == 0) {
			notifyAll();
		}

		queue.add(item);

	}

	public synchronized void dequeue() throws InterruptedException {
		{

			while (queue.size() == 0) {
				wait();
			}

			if (queue.size() == limit) {
				notifyAll();
			}

			queue.remove(0);
		}

	}
}
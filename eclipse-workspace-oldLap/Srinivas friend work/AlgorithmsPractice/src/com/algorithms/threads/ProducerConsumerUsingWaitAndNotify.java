package com.algorithms.threads;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerUsingWaitAndNotify {

	public static void main(String args[]) {

		Queue<String> queue = new LinkedBlockingQueue<>();
		int max = 20;

		Producer1 producer = new Producer1(queue, max);
		Consumer1 consumer = new Consumer1(queue);

		producer.start();
		consumer.start();

	}

}

class Producer1 extends Thread {
	Queue<String> queue;
	int max;

	Producer1(Queue<String> queue, int max) {
		this.queue = queue;
		this.max = max;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (queue) {
				System.out.println("queue is " + queue);
				while (queue.size() == max) {
					try {
						System.out.println("Queue Size is full , waiting for consumer to consume ");
						queue.wait();
					} catch (InterruptedException e) {

					}
				}
				Random random = new Random();
				int i = random.nextInt();

				String randomData = i  + "";
				System.out.println("Producing " + randomData);
				queue.add(randomData);
				queue.notify();
			}

		}

	}

}

class Consumer1 extends Thread {
	Queue<String> queue;

	Consumer1(Queue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		while (true) {

			synchronized (queue) {

				System.out.println("queue is " + queue);
				while (queue.isEmpty()) {
					System.out.println("Queue Size is empty , waiting for producer to produce ");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				System.out.println("Consuming " + queue.remove());

				queue.notify();
			}

		}

	}

}
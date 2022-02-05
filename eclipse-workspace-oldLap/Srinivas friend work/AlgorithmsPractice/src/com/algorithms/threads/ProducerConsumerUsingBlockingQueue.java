package com.algorithms.threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerUsingBlockingQueue {

	public static void main(String args[]) {
		BlockingQueue<String> blockingQueue = new LinkedBlockingQueue();

		Producer producer = new Producer(blockingQueue);
		Consumer consumer = new Consumer(blockingQueue);

		producer.start();
		consumer.start();

	}

	
}
class Producer extends Thread {
	BlockingQueue blockingQueue;

	Producer(BlockingQueue blockingQueue) {
		super("Producer");
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			String currentThread = Thread.currentThread().getName();
			try {
				blockingQueue.put("" + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(currentThread + " producing " + i);
		}

	}

}

class Consumer extends Thread {
	BlockingQueue<String> blockingQueue;

	Consumer(BlockingQueue<String> blockingQueue) {
		super("Consumer");
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {

		while (true) {
			try {
				String dataConsumed = blockingQueue.take();
				String currentThread = Thread.currentThread().getName();
				System.out.println(currentThread + " consumed " + dataConsumed);
			} catch (InterruptedException e) {

			}
		}

	}

}
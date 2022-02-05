package com.algorithms.threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	public static void main(String[] args) throws InterruptedException {

		CountDownLatch countDownLatch = new CountDownLatch(3);
		Thread thread1 = new Thread(new Worker(countDownLatch, "T1"));
		Thread thread2 = new Thread(new Worker(countDownLatch, "T2"));
		Thread thread3 = new Thread(new Worker(countDownLatch, "T3"));
		
		thread1.start();
		thread2.start();
		thread3.start();
		countDownLatch.await();
		System.out.println("Finally Executing main Thread !! ");
	}

}

class Worker implements Runnable {
	CountDownLatch countDownLatch;
	String threadName;

	public Worker(CountDownLatch countDownLatch, String threadName) {
		this.countDownLatch = countDownLatch;
		this.threadName = threadName;
	}

	@Override
	public void run() {
		
		System.out.println("Executing " +  threadName);
		countDownLatch.countDown();

	}

}

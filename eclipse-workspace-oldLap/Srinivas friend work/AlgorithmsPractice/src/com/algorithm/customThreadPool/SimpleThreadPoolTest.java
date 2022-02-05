package com.algorithm.customThreadPool;

import java.util.concurrent.atomic.AtomicInteger;

public class SimpleThreadPoolTest {

	public static void main(String[] args) throws InterruptedException {

		int numOfWorkers = 10;
		int numOfThreads = 5;
		SimpleThreadPool simpleThreadPool = SimpleThreadPool.getInstance(numOfThreads);
		 AtomicInteger count = new AtomicInteger(0);
		Runnable runnable = new Runnable() {

			@Override
			public void run() {

				System.out.println("Executing Thread !! ");
				count.getAndIncrement();
			}
		};

		for (int i = 0; i < numOfWorkers; i++) {
			simpleThreadPool.execute(runnable);
		}
		
		Thread.currentThread().sleep(1000);
		System.out.println("final count is " +  count.get());
	}

}

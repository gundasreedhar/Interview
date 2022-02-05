package com.threads;

import java.util.concurrent.CountDownLatch;

public class TestHarness {
	private MyRunnable myRunnable;

	public TestHarness(MyRunnable myRunnable) {
		this.myRunnable = myRunnable;
	}

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch startCountDownLatch = new CountDownLatch(1);
		CountDownLatch endCountDownLatch = new CountDownLatch(4);

		MyRunnable myRunnable = new MyRunnable();
		TestHarness testHarness = new TestHarness(myRunnable);
		for (int i = 0; i < 4; i++) {
			Thread t1 = new Thread() {
				@Override
				public void run() {

					try {
						startCountDownLatch.await();
						myRunnable.run();
					} catch (InterruptedException e) {
					} finally {
						endCountDownLatch.countDown();
					}
				}
			};
			
			 t1.start();
		}

		System.out.println("Before start Countdown ");
		startCountDownLatch.countDown();

		
		endCountDownLatch.await();
		System.out.println("Before End await ");

	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {

		System.out.println("A");

	}

}

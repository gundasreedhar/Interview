package com.threads;

public class ThreadLocalTest1 {

	public static class MyRunnable implements Runnable {

		ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

		@Override
		public void run() {

			threadLocal.set((int) (Math.random() * 100));

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(threadLocal.get());
		}

	}

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread(myRunnable);
		Thread t2 = new Thread(myRunnable);
		t1.start();
		t2.start();

	}
}

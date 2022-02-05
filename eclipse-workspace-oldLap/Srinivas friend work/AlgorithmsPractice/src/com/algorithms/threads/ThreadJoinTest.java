package com.algorithms.threads;

public class ThreadJoinTest extends Thread {

	public void run() {

		for (int i = 0; i < 2; i++) {

			System.out.println("Current Thread is " + Thread.currentThread().getName());

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}

			System.out.println(i);

		}
	}

	public static void main(String args[]) {

		ThreadJoinTest t1 = new ThreadJoinTest();
		ThreadJoinTest t2 = new ThreadJoinTest();
		ThreadJoinTest t3 = new ThreadJoinTest();

		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {

		}

		t2.start();

		try {
			t2.join();
		} catch (InterruptedException e) {

		}

		t3.start();

		try {
			t3.join();
		} catch (InterruptedException e) {

		}

	}

}
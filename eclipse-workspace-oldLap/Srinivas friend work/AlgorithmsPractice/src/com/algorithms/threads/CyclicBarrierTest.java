package com.algorithms.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public static void main(String args[]) {

		Runnable barrierAction1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(" Barrier1 executed ");
			}
		};

		Runnable barrierAction2 = new Runnable() {
			public void run() {
				System.out.println(" Barrier2 executed ");
			}
		};

		CyclicBarrier cyclicBarrier1 = new CyclicBarrier(2, barrierAction1);
		CyclicBarrier cyclicBarrier2 = new CyclicBarrier(2, barrierAction2);

		Thread t1 = new Thread(new WorkThread(cyclicBarrier1, cyclicBarrier2));
		Thread t2 = new Thread(new WorkThread(cyclicBarrier1, cyclicBarrier2));
		t1.start();
		t2.start();

	}

}

class WorkThread implements Runnable {
	CyclicBarrier barrier1;
	CyclicBarrier barrier2;

	WorkThread(CyclicBarrier barrier1, CyclicBarrier barrier2) {
		this.barrier1 = barrier1;
		this.barrier2 = barrier2;
	}

	public void run() {

		System.out.println(Thread.currentThread().getName() + " waiting for barrier1");
		try {
			barrier1.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " waiting for barrier2");
		try {
			barrier2.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "  executed !! ");
	}

}

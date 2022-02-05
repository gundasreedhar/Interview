package com.algorithm.customThreadPool;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class SimpleThreadPoolThread extends Thread{

	private ConcurrentLinkedQueue<Runnable> runnables;
	private AtomicBoolean execute;

	public SimpleThreadPoolThread(ConcurrentLinkedQueue<Runnable> runnables, AtomicBoolean execute) {
		this.runnables = runnables;
		this.execute = execute;

	}

	@Override
	public void run() {

		while (execute.get() || !runnables.isEmpty()) {
			Runnable runnable;
			while ((runnable = runnables.poll()) != null) {
				runnable.run();
			}

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

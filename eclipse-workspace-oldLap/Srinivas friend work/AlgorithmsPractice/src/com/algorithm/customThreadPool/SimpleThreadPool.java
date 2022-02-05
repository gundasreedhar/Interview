package com.algorithm.customThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleThreadPool {
	private static AtomicInteger poolNumber = new AtomicInteger(0);
	AtomicBoolean execute = new AtomicBoolean(true);
	ConcurrentLinkedQueue<Runnable> runnables;
	List<SimpleThreadPoolThread> simpleThreadPoolThreads;

	private SimpleThreadPool(int numberOfThreads) {
		poolNumber.getAndIncrement();
		runnables = new ConcurrentLinkedQueue<>();
		simpleThreadPoolThreads = new ArrayList<>();
		for (int i = 0; i < numberOfThreads; i++) {
			SimpleThreadPoolThread simpleThreadPoolThread = new SimpleThreadPoolThread(runnables, execute);
			simpleThreadPoolThread.start();
			this.simpleThreadPoolThreads.add(simpleThreadPoolThread);
		}

	}

	public static SimpleThreadPool getInstance(int numberOfThreads) {
		return new SimpleThreadPool(numberOfThreads);
	}

	public void execute(Runnable runnable) {
		this.runnables.add(runnable);
	}

	public void terminate() {
		this.runnables.clear();
		stop();

	}

	public void stop() {
		this.execute.set(false);
	}

}

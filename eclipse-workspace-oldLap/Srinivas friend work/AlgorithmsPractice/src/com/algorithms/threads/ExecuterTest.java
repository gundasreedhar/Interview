package com.algorithms.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterTest {

	public static void main(String args[]) {
		ExecutorService executerService = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 100; i++) {
			executerService.submit(new Task(i));
		}
	}

}

class Task implements Runnable {

	private int taskId;

	public Task(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public void run() {

		System.out.println("Executing " + Thread.currentThread().getName() + " with taskId  " + taskId);

	}

}
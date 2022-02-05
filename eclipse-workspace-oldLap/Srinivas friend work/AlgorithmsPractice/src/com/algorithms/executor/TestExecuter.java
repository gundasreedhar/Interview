package com.algorithms.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestExecuter {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		List<Future<String>> futures = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			Future<String> futureData = executorService.submit(new Worker(i));
			futures.add(futureData);
		}

		for (Future<String> future : futures) {
			System.out.println(future.get());
		}
		
	//	executorService.shutdown();

	}

}

class Worker implements Callable<String> {

	int i;

	public Worker(int i) {
		this.i = i;
	}

	public String call() throws Exception {

		System.out.println("Inside callable : ");
		return "Callable executed ";

	};
}

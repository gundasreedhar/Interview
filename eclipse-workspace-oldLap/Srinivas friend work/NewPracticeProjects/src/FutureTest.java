

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		List<Future<String>> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Task<String> task = new Task("name_" + i);
			Future<String> future = executorService.submit(task);
			list.add(future);
		}

		for (Future<String> future : list) {
			try {
				String futureOutput = future.get();
				System.out.println("output is " + futureOutput);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Task<String> implements Callable<String> {

	private String name;

	public Task(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		return name;
	}

}

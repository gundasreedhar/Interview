package com.algorithms.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/*>>> code from below link*/
/*https://www.pluralsight.com/guides/introduction-to-the-fork-join-framework
*/public class ForkJoinDemo {

	public static void main(String[] args) {
		List<Long> data = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			Long l = (long) i;
			data.add(l);
		}

		SumAction sumActionTask = new SumAction(data);
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		forkJoinPool.invoke(sumActionTask);

	}

}

class SumAction<Long> extends RecursiveTask<Long> {

	List
	public SumAction(List<Long> data) {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Long compute() {
		// TODO Auto-generated method stub
		return null;
	}

}
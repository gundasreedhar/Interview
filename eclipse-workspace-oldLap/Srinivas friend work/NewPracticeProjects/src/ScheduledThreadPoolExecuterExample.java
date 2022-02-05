

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecuterExample {

	public static void main(String[] args) throws InterruptedException {
		//ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		ScheduledThreadPoolExecutor scheduledExecutorService = new ScheduledThreadPoolExecutor(1);

		
		MyTask myTask = new MyTask();

		/*
		 * scheduledExecutorService.scheduleWithFixedDelay(myTask, 0, 2,
		 * TimeUnit.SECONDS);
		 */

		scheduledExecutorService.scheduleAtFixedRate(myTask, 0, 2, TimeUnit.SECONDS);
		scheduledExecutorService.schedule(new MyTask1(), 3, TimeUnit.SECONDS);
		scheduledExecutorService.schedule(new MyTask2(), 3, TimeUnit.SECONDS);

		Thread.sleep(8000);

		scheduledExecutorService.shutdown();
	}

}

class MyTask implements Runnable {

	public void run() {

		System.out.println("Started task " + new Date());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Ended Task ! " + new Date());
	}

}

class MyTask1 implements Runnable {
	public void run() {
		System.out.println("Task1 is running " + new Date());
	}
}

class MyTask2 implements Runnable {
	public void run() {
		System.out.println("Task2 is running" + new Date());
	}
}

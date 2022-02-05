import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecuterTest {

	public static void main(String[] args) {

		String n = new String("so");
		Task1 task1 = new Task1(1);
		Task1 task2 = new Task1(2);
		Task1 task3 = new Task1(3);
		Task1 task4 = new Task1(4);
		

		Executor executor = Executors.newFixedThreadPool(3);

		executor.execute(task1);
		executor.execute(task2);
		executor.execute(task3);
		executor.execute(task4);
	}

}

class Task1 implements Runnable {

	private int counter;

	public Task1(int counter) {
		this.counter = counter;
	}

	public void run() {

		System.out.println("Executing task  " + counter);
		System.out.println(Thread.currentThread().getName());
	}
}

class CustomExecuter implements Executor {

	public void execute(Runnable command) {
		new Thread(command).start();
		
		
		//command.run();
	}
}

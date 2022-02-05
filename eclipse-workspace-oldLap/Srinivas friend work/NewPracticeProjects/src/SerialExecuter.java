import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SerialExecuter implements Executor {

	Queue<Runnable> queue = new ArrayDeque<>();
	Executor executor;
	Runnable active;

	public SerialExecuter(Executor executor) {
		this.executor = executor;
	}

	synchronized public void execute(Runnable runnable) {
		queue.offer(new Runnable() {

			@Override
			public void run() {
				System.out.println("Calling common executer and delegating to proper executer ");
				try {
					runnable.run();
				} finally {
					System.out.println("In Finally ");
					scheduleNext();
				}

			}
		});

		if (active == null) {
			System.out.println("In null check ");
			scheduleNext();
		}

	}

	synchronized private void scheduleNext() {
		if ((active = queue.poll()) != null) {
			executor.execute(active);
		}

	}

	public static void main(String[] args) {
		Executor normalExecuter = Executors.newFixedThreadPool(1);
		Executor executor = new SerialExecuter(normalExecuter);
		Task1 task1 = new Task1(1);
		Task1 task2 = new Task1(2);
		Task1 task3 = new Task1(3);
		executor.execute(task1);
		executor.execute(task2);
		executor.execute(task3);

	}

}

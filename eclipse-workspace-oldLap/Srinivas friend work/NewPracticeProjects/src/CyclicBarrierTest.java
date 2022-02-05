

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public static void main(String[] args) {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
		Service serviceOne = new Service("serviceOne", cyclicBarrier);
		Service serviceTwo = new Service("serviceTwo", cyclicBarrier);

		Thread t1 = new Thread(serviceOne);
		Thread t2 = new Thread(serviceTwo);

		t1.start();
		t2.start();

		try {
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main service starting ");
	}
}

class Service implements Runnable {
	private String name;
	private CyclicBarrier cyclicBarrier;

	public Service(String name, CyclicBarrier cyclicBarrier) {
		this.name = name;
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(1000);

			System.out.println("Processing thread " + name + " is done ");

			cyclicBarrier.await();
		} catch (InterruptedException e) {
			// TODO: handle exception
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
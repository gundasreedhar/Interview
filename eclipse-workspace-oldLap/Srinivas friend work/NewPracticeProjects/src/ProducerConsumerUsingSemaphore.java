

import java.util.concurrent.Semaphore;

public class ProducerConsumerUsingSemaphore {

	public static void main(String[] args) {

		Semaphore producerSemaphore = new Semaphore(1);
		Semaphore consumerSemaphore = new Semaphore(0);

		ProducerSem producerSem = new ProducerSem(producerSemaphore, consumerSemaphore);
		ConsumerSem consumerSem = new ConsumerSem(consumerSemaphore, producerSemaphore);

		Thread t1 = new Thread(consumerSem);
		Thread t2 = new Thread(producerSem);

		t1.start();
		t2.start();
	}
}

class ProducerSem implements Runnable {
	Semaphore producerSemaphore;
	Semaphore consumerSemaphore;

	public ProducerSem(Semaphore producerSemaphore, Semaphore consumerSemaphore) {
		this.producerSemaphore = producerSemaphore;
		this.consumerSemaphore = consumerSemaphore;
	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			try {
				producerSemaphore.acquire();
				System.out.println("Produced  Data " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			consumerSemaphore.release();

		}

	}
}

class ConsumerSem implements Runnable {

	Semaphore consumerSemaphore;
	Semaphore producerSemaphore;

	public ConsumerSem(Semaphore consumerSemaphore, Semaphore producerSemaphore) {
		this.consumerSemaphore = consumerSemaphore;
		this.producerSemaphore = producerSemaphore;
	}

	public void run() {

		for (int i = 0; i < 5; i++) {

			try {

				consumerSemaphore.acquire();
				System.out.println("Consumed Data  " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			producerSemaphore.release();
		}

	}

}

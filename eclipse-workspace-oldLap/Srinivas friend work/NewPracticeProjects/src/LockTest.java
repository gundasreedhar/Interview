import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

	public static void main(String[] args) {

		ProducerConsumerImpl producerConsumerImpl = new ProducerConsumerImpl();
		Producer1 producer1 = new Producer1(producerConsumerImpl);
		Consumer1 consumer1 = new Consumer1(producerConsumerImpl);

		consumer1.start();
		producer1.start();

	}

}

class ProducerConsumerImpl {

	private int CAPACITY = 1;
	private List<Integer> list = new ArrayList();
	ReentrantLock lock = new ReentrantLock();
	Condition takeCondition = lock.newCondition();
	Condition putCondition = lock.newCondition();

	public ProducerConsumerImpl() {

	}

	void put() throws InterruptedException {
		lock.lock();

		try {
			if (list.size() == CAPACITY) {
				takeCondition.await();
			}
			
			list.add(1);
			putCondition.signal();
		} finally {
			lock.unlock();
		}

	}

	void get() throws InterruptedException {
		lock.lock();

		try {
			if (list.size() == 0) {
				putCondition.await();
			}
   
			list.remove(0);
			takeCondition.signal();
		} finally {
			lock.unlock();
		}

	}

}

class Producer1 extends Thread {

	ProducerConsumerImpl producerConsumerImpl;

	public Producer1(ProducerConsumerImpl producerConsumerImpl) {
		this.producerConsumerImpl = producerConsumerImpl;
	}

	@Override
	public void run() {
		try {
			producerConsumerImpl.put();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Consumer1 extends Thread {
	ProducerConsumerImpl producerConsumerImpl;

	public Consumer1(ProducerConsumerImpl producerConsumerImpl) {
		this.producerConsumerImpl = producerConsumerImpl;
	}

	@Override
	public void run() {
		try {
			producerConsumerImpl.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

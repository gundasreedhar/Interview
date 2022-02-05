

import java.util.concurrent.Exchanger;

public class ExchangerTest {

	public static void main(String[] args) {

		Exchanger<String> exchanger = new Exchanger<>();

		Producer producer = new Producer(exchanger);
		Consumer consumer = new Consumer(exchanger);

		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);

		t1.start();
		t2.start();
	}

}

class Producer implements Runnable {

//	private String str;
	private Exchanger<String> exchanger;

	Producer(Exchanger<String> exchanger) {
		this.exchanger = exchanger;
		//str = new String();
	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			String	str = new String();
			str  += i;
			System.out.println("Produced : " + i);

			try {
				exchanger.exchange(str);

			} catch (InterruptedException e) {
			}
		}

	}

}

class Consumer implements Runnable {

	private String str;
	private Exchanger<String> exchanger;

	public Consumer(Exchanger<String> exchanger) {
		this.exchanger = exchanger;
	}

	public void run() {

		for (int i = 0; i < 5; i++) {

			try {
				str = exchanger.exchange(new String());
				System.out.println("Consumed: " + str);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
	}

}
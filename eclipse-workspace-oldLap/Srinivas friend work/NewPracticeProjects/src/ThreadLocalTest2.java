

public class ThreadLocalTest2 {

	public static class MyRunnable implements Runnable {

		int d = 0;

		@Override
		public void run() {

			synchronized (this) {

				d = (int) (Math.random() * 100);
			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(d);
		}

	}

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread(myRunnable);
		Thread t2 = new Thread(myRunnable);

		t1.start();
		t2.start();
	}
}

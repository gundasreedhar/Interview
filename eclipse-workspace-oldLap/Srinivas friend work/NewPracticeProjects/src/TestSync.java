
public class TestSync implements Runnable {
	String name;

	public static void main(String[] args) {
		Thread t1 = new Thread(new TestSync());
		Thread t2 = new Thread(new TestSync());
		t1.start();
		t2.start();

	}

	synchronized void printName() {
		System.out.println("Name is Mohit");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized void printClass() {
		System.out.println("Class is 10th ");
	}

	@Override
	public void run() {

		printName();
		printClass();

	}
}

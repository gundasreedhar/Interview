package multithreading;

class Sender
{
	public void sendMsg( String msg)
	{
		System.out.println("sending " + msg);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("interrupted");
		}
		
		System.out.println(msg + " sent.");
	}
}
class Wave extends Thread
{
	 String msg;
	 Sender sender;
	
	Wave(String msg,Sender sender)
	{
		this.msg = msg;
		this.sender = sender;
	}
	
	@Override
	public void run() {
		synchronized (sender) {
			sender.sendMsg(msg);
		}
		
	}
	
}

public class UsingSynchronisedKeyword {

	public static void main(String[] args) throws InterruptedException {
		Sender send = new Sender();
		Wave w1 = new Wave("hi", send );
		Wave w2 = new Wave("hello", send );
		w1.start();
		w2.start();
		w1.join();
		w2.join();
		System.out.println("Msg sent by shreedhar");
		
	}

}

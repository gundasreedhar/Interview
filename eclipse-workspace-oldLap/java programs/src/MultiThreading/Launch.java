// extending the Thread class
/*class Hello extends Thread 
{
	public void run()
	{
		System.out.println("hello");
	}

}
class Hi extends Thread
{
	public void run()
	{
		System.out.println("Hi");
	}
}*/

class Launch 
{
	public static void main(String[] args) throws Exception
	{
		//Thread t1 = new Thread( new Hello() );
		Thread t1 = new Thread( () ->
		{
			for(int i = 1 ; i< 6 ; i++)
			{	System.out.println("Hi");
			try{Thread.sleep(100);} catch(Exception e){}}
		});
		Thread t2 = new Thread( () ->
		{
			for(int i = 1 ; i< 6 ; i++)
			{	System.out.println("Hello");
			try{Thread.sleep(100);} catch(Exception e){}}
		});
			//t1.join();
			
		t1.start();
		try{Thread.sleep(1000);} catch(Exception e){} 
		t2.start();

		t1.join();
		t2.join();
		
		System.out.println("msdf,jhefkha ");
	}
}

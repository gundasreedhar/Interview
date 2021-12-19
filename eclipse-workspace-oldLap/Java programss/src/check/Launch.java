class Launch 
{
	public static void main(String[] args) 
	{
		Thread d = Thread.currentThread();
		System.out.println(d);
		d.setName("worker 1");
		d.setPriority(9);
		System.out.println(d);
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

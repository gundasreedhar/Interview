class Demo1
{
	private String name;
	public void disp()
	{
		System.out.println(name);
	}
	
	Demo1()
	{
		name = "shreedhar";;
	}
}
class  F extends Demo1
{
	//if u dont override the disp() method then you can access the private data name. 
	// if you override the disp then you can access the private data as shown below:
	public void dis()
	{
		super.disp();   //shreedhar
		disp(); // venkateshwara
	}
	public void disp()
	{
		System.out.println("venkateshwara");
	}

}
class Important extends Demo1
{

	public static void main(String[] args) 
	{
		F o = new F();
		o.dis();
	}
}


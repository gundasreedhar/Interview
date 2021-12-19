package Practice1;

public class InheritenceOne {
	public void disp()
	{
		System.out.println("Inside the InheritenceOne");
	}
}

class InheritenceTwo extends InheritenceOne 
{
	@Override
	public void disp() {
		// TODO Auto-generated method stub
		//super.disp();
		System.out.println("Inside the InheritenceTwo");
		
	}
}

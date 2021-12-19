package verifone;

import java.util.ArrayList;

class A
{
	void disp()
	{
		System.out.println("class A");
	}
	void mal()
	{
		System.out.println("other");
	}
}
class B extends A
{	
	void disp()
	{
		super.mal(); // parent class ref
		System.out.println("Class B");
	}
}
public class SuperInterviewQue {

	public static void main(String[] args) {
		A b = new B();
		b.disp();
		ArrayList a = new ArrayList();
		a.size();
		system.
	}
}

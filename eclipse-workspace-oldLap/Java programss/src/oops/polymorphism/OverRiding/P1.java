class Parent 
{
	public void disp()
	{
		System.out.println(" parent class disp() method is invoked");
	}
}

class Child extends Parent
{ 

	public void disp()

	{
		System.out.println(" child class disp() method is invoked ");
	}
	
}
class P1
{
	
	public static void main(String [] mahe)
	{

		Parent p = new Child(); // polymorphism achived with code NON-Reducebality.
	
		p.disp();  // disp() of child class is invoked

	
	
	}

}
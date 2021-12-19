// class method is having higher priority than default method in the interface

interface A
{
	default void show()
	{
		System.out.println("interface A");
	}
}
interface B
{
	default void show()
	{
		System.out.println("interface B");
	}
}
class C
{
	public void show()
	{
		System.out.println("class C");
	}
}
class Property_2 extends C implements A,B
{
	public static void main (String [ ] args)
	{
		/*
		 * Object o = new Object (); o = "Shreedhar"; System.out.println(o.toString());
		 * 
		 * First f = new First(); System.out.println(f.toString());
		 */
		Property_2 obj = new Property_2();
		obj.show();
		
		
	}
}
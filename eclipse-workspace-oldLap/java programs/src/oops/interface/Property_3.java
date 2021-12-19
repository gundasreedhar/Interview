/*
  Two interface having the same method show(); are implemented in anothr class as show below
*/

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
class C implements A,B
{
	public void show()
	{
		A.super.show();
		// we can also have both,, 
		//  B.super.show();
	}
}
class Property_3 
{
	public static void main(String[] args) 
	{
		C obj = new C();
		obj.show();
	}
}

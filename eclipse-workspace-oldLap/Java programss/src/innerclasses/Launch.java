/*
Inner class is a class within a class.

Types of Inner classes:-
1. nested or non-static inner class
2. static nested class 
3. Method Local inner class 
3. Anonymous class
4. Lambda

*/

class Outer
{
	class Inner
	{
		public void show()
		{
			System.out.println("my name is shreedhar");
		}
	}
}
class Nested_Inner_Class
{
	public static void main(String [] args)
	{
		Outer o = new Outer();
		Outer.Inner obj = o.new Inner();
		obj.show();
	}
} 
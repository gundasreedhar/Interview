class Outer
{
    static class Inner
	{
		public void show()
		{
			System.out.println("shreedhar");
		}
	}
}

public class Static_Nested_Inner_Class
{
	public static void main(String[] args)
	{
		Outer.Inner obj = new Outer.Inner();
		obj.show();
	}

}

/* Below program is found in Geeks for Geeks for Static_Nested_Inner_Class  
   which doesnt work
     so, this might not be example for this topic


class Static_Nested_Inner_Class
{
	public static void show()
	{
		System.out.println("shreedaha");
	}
	static class Inner
	{
		public static void main(String [] args)
		{
			show();
		}
	}
} 
*/
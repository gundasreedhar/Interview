class Exceptionn 
{
	public static void divide(int a, int b)
	{
		int c = a/b;
	}
	public static void main(String[] args) 
	{
		try{
			divide(1,0);
		}catch(Exception e){System.out.println("try catch is execued");}
		System.out.println("Hello World!");
	}
}

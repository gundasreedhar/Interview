interface Cal
{
	void operate();
}
class K implements Cal
{

}
class Mon 
{
	public static void main(String[] args) 
	{
		K t = new K ( () -> {System.out.println("this is operate method"); });
		t.operate();
//		System.out.println("Hello World!");
	}
}

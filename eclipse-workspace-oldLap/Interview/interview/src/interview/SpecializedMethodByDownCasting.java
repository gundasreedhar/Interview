package interview;

import java.util.Comparator;

class A{
	public void disp()
	{
		System.out.println("disp mehtod");
	}
}
interface C 
{
	
}
interface D{}
class B extends A implements C,D,Comparator<Integer>
{
	public void show()
	{
		System.out.println("this is specialized method");
	}
	
	int show(int a )
	{
		return a;
	}
	
	//static int show(int c)
	//{
	//	return c;
	//}
	
	
	
	

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}

class Check extends B{
	public A showw()
	{
		return new A();
	}
}

class Demo extends Check{
	public Check showw() {
		return new Check();
	}
}
interface Cehck
{
	public static final int a = 1;
	default public void computeSum() {
		System.out.println("sdnjsdf");
	}
}

public class SpecializedMethodByDownCasting {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.disp();
		((B)obj).show();
	}

}

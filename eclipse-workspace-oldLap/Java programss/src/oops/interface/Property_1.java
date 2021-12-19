// An interface can have the concrete method 
// Achived by using default KeyWord 
interface Plane
{
	default public void fly()
	{
		System.out.println("plane is flying");		
	}
}
/*
* default keyword doesnt work for the absract class 

abstract class Plane
{
	default abstract public void fly()
	{
		System.out.println("plane is flying");		
	}
}
*/

class Property_1 extends Plane
{
	public static void main(String[] args) 
	{
		//Launch l = new Launch();
		new Launch().fly();
	}
}
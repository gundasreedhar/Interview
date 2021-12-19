class Parent 
{
	private int salary = 7000;  // Achiveing the Encapsulaion
	public int getSalary(){ return salary; }
	public void disp()
	{
		System.out.println(" parent class disp() method is invoked ");
	}
}

class Child extends Parent
{ 
	private int salary = 400;
	public int getSalary(){ return salary; }
	public void disp()
	{
		/* super keyword makes the jvm to search the method in the parent class.
		 * 
		 * you can't use this super keyword inside the main function.
		 * 
		 */
		System.out.println( " Child's salary : " + getSalary() ); // child's salary is returned
		System.out.println( " Parent's salary : " + super.getSalary() ); // parent's salary is returned 
		
		//System.out.println( super.disp() ); // you cant call same method of parent's
	}
	
}
class P2
{
	
	public static void main(String [] mahe)
	{

		Parent p = new Child(); // polymorphism achived
	
		p.disp();  // disp() of child class is invoked
	
	}

}
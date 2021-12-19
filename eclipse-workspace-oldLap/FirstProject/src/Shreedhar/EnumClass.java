package Shreedhar;

public enum EnumClass {
	instance(15000)
	{
		@Override
		void show() {
			// TODO Auto-generated method stub
			
		}
	},
	macha(2000)
	{
		@Override
		void show() {
			// TODO Auto-generated method stub
			
		}
	};
	
	static int count = 3;
	static final  public void mahe()
	{
		System.out.println("this is mahe ");
	}
	
	private int salary;
	private EnumClass(int salary) {
		this.salary = salary;
	}
	public void disp()
	{
		System.out.println("The salary is : " + salary);
	}
	
	abstract void show();
	
	private EnumClass() {
		// TODO Auto-generated constructor stub
		System.out.println("object created");
	}
	
}

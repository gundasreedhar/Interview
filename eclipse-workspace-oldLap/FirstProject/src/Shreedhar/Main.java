package Shreedhar;
class Main
{
	public static void main(String[] args) {
		EnumClass obj1 = EnumClass.instance;
		EnumClass obj2 = EnumClass.instance;
		if (obj1 == obj2) {
			System.out.println("same references");
		}
		if (obj1 == EnumClass.instance) {
			System.out.println("same references");
		}
		
		System.out.println(obj1);
		
		//EnumClass.instance= EnumClass.macha;  Not possible since instance is final
		//obj1.disp(); 
		//obj2.disp();
		/*
		 * you can't create the clone if the enum 
		 * EnumClass obj3 = obj1.clone();
		 */
		
	}
}
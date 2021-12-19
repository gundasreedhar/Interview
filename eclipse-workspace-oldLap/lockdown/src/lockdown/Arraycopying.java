package lockdown;

public class Arraycopying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name1 = {"shiva","guru","vasim"};
		System.out.println(name1);  // ref is printed
		for(String n : name1)
		{
			System.out.println(n);
		}
		String [] name2 = new String[name1.length];
		//System.arraycopy(name1, 0, name2, 0, 3);
		System.out.println("new array\n");
		name2 = name1.clone();
		for(String n : name2)
		{
			System.out.println(n);
		}
		
		System.out.println("original array modified");
		name1[0] = "shreedhar";
		for(String n : name1)
		{
			System.out.println(n);
		}
		for(String n : name2)
		{
			System.out.println(n);
		}

}
}


public class Customer {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setName("Rohit");
		
		Customer customer2 = new Customer();
		customer2.setName("Sohit");
		
		func(customer1,customer2);
		
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
	}

	private static void func(Customer customer1, Customer customer2) {
		customer2.setName("Purohit");
		customer1 = customer2;
		System.out.println("data1 ins func is " + customer1.getName());
		System.out.println("data2 ins func is " + customer2.getName());
		
	}

}

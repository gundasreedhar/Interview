package interview;
// Immutable class in java means that, once the object of that class is created then we can t change that 
// object contents. here contents refer to class fields and methods also
public class ImmutableClass {

	public static void main(String[] args) {
		Institute bellary = new Institute("BITM" , "9738486300");
		System.out.println(bellary.getName() + "====" + bellary.getPhone());
		//bellary.phone = "sdf";
	}
}

final class Institute // to restrict from extending that class and over-riding the original methods
{
	final private String name;  // final, to restrict this class's other methods from changing these fields 
	final private String phone;
	
	Institute (String name, String phone)
	{
		this.name = name;
		this.phone = phone;
	}
	
	String getName()
	{
		return this.name;
	}
	
	String getPhone()
	{
		return this.phone;
	}
}
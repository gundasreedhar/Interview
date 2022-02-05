package java8practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Workers
{
	private int usn;
	private String name;
	
	
	
	
	
	public Workers(int usn, String name) {
		super();
		this.usn = usn;
		this.name = name;
	}
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String
			name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Workers [usn=" + usn + ", name=" + name + "]";
	}
	
	
	
	
}
public class NullExceptionRemoval {
	public static void main(String[] args)
	{	
		Workers s1 = new Workers(1,"shreedhar");
		Workers s2 = new Workers(2,null);
		
		/*
		 * List<Workers> list = new ArrayList<Workers>(); list.add(s1);list.add(s2);
		 */
		
		String k = s2.getName();
		System.out.println(k);
		
		//k.toUpperCase(); // gives null so now  to avoid this will go to Optional<>
		
		//Optional.empty()  // gives Optional.empty in console
		// to get the optional object we have of() and
		/* about Optional.of()
		 * 
		 *  use this only whn u are sure about the retriving field is not null in the object.
		 *  Here in below example im sure about object 1.  
		*/
		Optional<String> optional = Optional.of(s1.getName());
		System.out.println(optional);
		
		
		
		/*
		 * use this Optional.ofNullable() if u r not sure about weather it gives null or not
		 * returns Optinal.empty if null is present
		 */
		Optional<String> optionalTwo = Optional.ofNullable(s2.getName());  // here optionalTwo can be null also
		
		
		// After getting the optinal object u can now use to in following ways
		
		if(optionalTwo.isPresent())
		System.out.println(optionalTwo.get()); // returns noSuchArgument exception if null if u dont use optionalTwo.isPresent() 
		//OR
		// prints the string if it has null
		System.out.println(optionalTwo.orElse("name unknown")); 
		// throws the exception if null
		//System.out.println(optionalTwo.orElseThrow(()->new IllegalArgumentException("name not present  ")));
		
		
		
		
		// now i need to MODIFY the value in the optional then i go with using map()
		// since the optionalTwo is from ofNullable() so optionalTwo might contain null also, so use orElse() to print some default value
		System.out.println(optionalTwo.map(String::toUpperCase)); // returns Optional.emty
		System.out.println(optionalTwo.map(String::toUpperCase).orElse("name is not present"));
		System.out.println(optionalTwo.map(String::toUpperCase).orElseGet(()->"default name.."));
		
		
		
	}
}

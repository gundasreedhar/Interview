package Practice1;

public class OverridingTest extends One{
	
	static void disp(){
		System.out.println("");
	}
}

class One{
	static void disp() {
		System.out.println("static method");
	}
}
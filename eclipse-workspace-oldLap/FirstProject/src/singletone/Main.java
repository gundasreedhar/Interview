package singletone;

public class Main {
	public static void main(String[] args) {
		SingleTone t = SingleTone.getSingleTone();
		SingleTone two = SingleTone.getSingleTone();
		if(t == two)
		{
			System.out.println("True");
		}
		t.disp();
		System.out.println("singlrtone");
	}

}

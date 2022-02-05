
public class TestBits {

	
	public static void main(String[] args) {
		int x = -1 << 29;
		System.out.println("-1 << COUNT_BITS " +  x);
		
		
		int b = x | 0;
		
		System.out.println("b is " + b );
		
		
		int CAPACITY = 536870911;
		System.out.println("0<<29 is " + ((-536870912+1) & ~CAPACITY));
		
		System.out.println("1 << bitNo is " + ((1 << 9) & (17)));
	}
}

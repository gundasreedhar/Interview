package SrinivasPrograms;


public class Parsing {

	public static void main(String[] args) {
		System.out.println(check('A', 'A'));
		System.out.println(check("abc", "abc"));
		System.out.println(check(12, 10));
		
		int in = Integer.valueOf(01);
		System.out.println("wds " + in);
	}

	private static int check(Object o1, Object o2) {
		String value1 = String.valueOf(o1);
		String value2 = String.valueOf(o2);
		return value1.compareTo(value2);
	}
}
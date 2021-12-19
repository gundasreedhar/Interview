
public class ExceptionPractice {
	public static void main(String[] args) {
		System.out.println(sprout(100));
	}

	static int sprout(int in) {
		try {
			int i = 10 + in;
			return i;
		} catch (Exception e) {
			return 1000;
		} finally {
			System.out.println("Finally called");
		}
	}
}

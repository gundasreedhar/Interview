
import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] str = { 7, 2, 5, 1, 3 };
		for (int i = 0; i < str.length; i++) {
			for (int j = 1; j < str.length - i; j++) {
				if (str[j - 1] > str[j]) {
					int temp = str[j - 1];
					str[j - 1] = str[j];
					str[j] = temp;
					System.out.println(Arrays.toString(str));
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}
}
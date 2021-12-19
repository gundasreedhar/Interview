

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {
	static int n1 = 0, n2 = 0, n3 = 1;

	static void printFibonacci(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ch = 'a'; ch < 'z'; ch++) {
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			map.put(ch, n1);
		}
		System.out.print(map);
		char[] ch = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			sum = sum + map.get(ch[i]);
			n3 = n1 + n2;
		}
		System.out.println("\n" + sum);
	}

	public static void main(String args[]) {
		printFibonacci("more");
	}
}
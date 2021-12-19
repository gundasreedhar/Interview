package interview;

import java.util.HashMap;
import java.util.Map;

public class PairOfSumsNumber {
	public static void pairOfSumsNumber(int[] arr, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int a : arr) {
			if (map.containsKey(a)) {
				System.out.println(a + "," + map.get(a));
			} else {
				map.put(sum - a, a);
			}
		}
	}p

	public static void main(String[] args) {
		int[] arr = { 11, 9, 6, 5, 13, 12, 4, 7, 8, 1, 2, 14 };
		pairOfSumsNumber(arr, 15);
	}

}

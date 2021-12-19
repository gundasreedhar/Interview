package SrinivasPrograms;


import java.util.HashMap;
import java.util.Map;

public class PairOfSumsNumbers {

	public static void main(String[] args) {
		int array[] = { 11, 9, 6, 5, 13, 12, 4, 7, 8, 1, 2 };
		paringMethod(array, 15);
	}

	public static void paringMethod(int some[], int k) {
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		for (int i = 0; i < some.length; i++) {
			if (pairs.containsKey(some[i])) {
				System.out.println(some[i] + " + " + pairs.get(some[i]));
			} else {
				pairs.put(k - some[i], some[i]);
			}
		}
	}
}

import java.util.Arrays;

public class Latestversion {

	public static void main(String[] args) {
		String[] thisIsArray = { "java.1.10.8", "java.1.8.8", "java.1.01.90", "java.1.107.71", "java.1.75.8" };
		Arrays.sort(thisIsArray);
		for (String element : thisIsArray) {
			System.out.println("Arrays sort " + element);
		}
		String[] thisIsAStringArray = { "java.1.10.8", "java.1.8.8", "java.1.01.90", "java.1.107.71", "java.1.75.8" };
		bubbleSort(thisIsAStringArray);
		for (String element : thisIsAStringArray) {
			System.out.println("bubbleSort " +element);
		}
		compareVersion("java.1.020", "java.1.011");
	}

	static void compareVersion(String v1, String v2) {
		if (v1.compareTo(v2) > 0) {
			System.out.println(v1);
		} else {
			System.out.println(v2);
			System.out.println("v1 " + v1.hashCode());
			System.out.println("v2 " + v2.hashCode());
		}
	}

	public static void bubbleSort(String[] arr) {
		int j = 0;
		String tmp;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			j++;
			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					sorted = false;
				}
			}
		}
	}
}
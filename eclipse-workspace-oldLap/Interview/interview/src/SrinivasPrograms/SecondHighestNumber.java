

public class SecondHighestNumber {
	public static void main(String[] args) {
		int[] arr = { -9, -8,-9,7,-3, 6, 4 };
		int lowest = arr[0];
		int secondHighest = -1;
		int highest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				secondHighest = highest;
				highest = arr[i];
			} else if (arr[i] > secondHighest && arr[i] < highest) {
				secondHighest = arr[i];
			}
			if (arr[i] > lowest && arr[i] < 0) {
				lowest = arr[i];
			}
		}
		System.out.println("lowest " + lowest);
		System.out.println("secondHighest " + secondHighest);
		System.out.println("high " + highest);
	}
}

public class MinElementsRemovalFromThreeNumber {

	public static void main(String[] args) {

		int arr[] = { 5, 2, 3, 6, 7, 8, 1 };

		int s = 0;
		int i = 1;
		int n = arr.length;
		int c = 0;
		while (s < n - 1 && i < n - 1) {
			if ((arr[s] > arr[i] && arr[i] < arr[i + 1]) || (arr[s] < arr[i] && arr[i] > arr[i + 1])) {

				s = i;
				i = i + 1;
			}

			else {
				c++;
				i = i + 1;
			}

		}

		System.out.println("Min elements to be removed are " + c);
	}

}

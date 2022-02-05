public class PersistentSystems {

	public static void main(String[] args) {
		int arr[] = { 1,2,3,6,7,8,9,1 };

		int k = 10;
		System.out.println("Given Array");
		printArray(arr);

		PersistentSystems ob = new PersistentSystems();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
		
		System.out.println(numberOfPairs(arr, k));
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Complete the numberOfPairs function below.
	static int numberOfPairs(int[] a, long k) {

		sort(a, 0, a.length - 1);

		int start = 0;
		int end = a.length - 1;
		int count = 0;
		if(a.length ==1 && k == a[0])
		{
			return 1;
		}
		while ((start < end) && start <= a.length - 1 && end >= 0) {

			if ((a[start] + a[end]) == k) {
				count++;
				start++;
				end--;
			}

			else if ((a[start] + a[end]) <= k) {
				start++;
			}

			else if ((a[start] + a[end]) >= k) {
				end--;
			}

		}

		return count;

	}

	static void sort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	static void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

}

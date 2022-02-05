import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Testaa {

	static int max = Integer.MIN_VALUE;;

	public static void main(String[] args) {

		String nn = "HG";
		nn.toLowerCase();
		System.out.println(nn);
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());

		String data2 = sc.nextLine();
		String[] strData = data2.split("\\s+");
		int[] intData = new int[size];
		for (int i = 0; i < strData.length; i++) {
			intData[i] = Integer.parseInt(strData[i]);
		}

		// int arr[] = { 0, 2, 3, 4, 9, 9 };

		for (int i = 0; i < intData.length; i++) {
			findMax(i, intData[i], intData);
		}

		System.out.println("max is " + max);

	}

	private static void findMax(int j, int tempSum, int arr[]) {

		if (j >= arr.length - 1) {
			return;
		}

		for (int i = j + 1; i < arr.length; i++) {
			if (arr[j] != 0 && (arr[i] % arr[j] == 0)) {
				int sum = tempSum + arr[i];
				findMax(i, sum, arr);
				if (sum > max) {
					max = sum;
				}
			}

		}
	}

}

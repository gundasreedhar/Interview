package interview;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
	public static void main(String... args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 };
		List list = new ArrayList();
		boolean flag = false;
		
		for (int n : num) {
			
			if (n == 2) {
				list.add(n);
				continue;
			}
			if (n == 1)
				continue;

			
			for (int i = 2; i <= n/2 ; i++) {
				if (n % i == 0) {
					flag = true;
					break;
				}
			}

			if (flag) {
				flag = false;
				continue;
			}

			list.add(n);

		}

		System.out.println(list);

	}
}

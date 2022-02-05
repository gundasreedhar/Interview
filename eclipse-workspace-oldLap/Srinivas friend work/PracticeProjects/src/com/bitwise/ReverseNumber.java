package com.bitwise;

public class ReverseNumber {

	public static void main(String[] args) {
		int n1 = 5;
		int res = (int) (Math.log(8) / Math.log(2));

		int numberOfBits = countNoOfBits(n1);
		System.out.println("numberOfBits is " + numberOfBits);
		int count = 0;

		/*for (int i = 0; i < 32; i++) {
			if (((1 << i) & n1) == 1 << i)
				count++;
		}

		System.out.println("c is " + count);
*/
		long n = 13;
		long nReverse = n;
		int s = 4;
		while (s > 0) {
			nReverse <<= 1;
			nReverse |= n & 1;
			s--;
			n = n>>1;
		}

		nReverse <<= s;

		System.out.println(nReverse);
	}

	private static int countNoOfBits(int n) {

		n = n | n >> 1;
		n = n | n >> 2;
		n = n | n >> 4;
		n = n | n >> 8;

		int x = n + 1 >> 1;
		int res = (int) (Math.log(x) / Math.log(2));

		return res+1;
	}

}

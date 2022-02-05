package com.perfios;

public class CoinChange {

	public static void main(String[] args) {

		int coinArr[] = { 1, 2, 3 };
		int totalAmount = 5;
		int coinDataLength = coinArr.length;

		int possibilities = generateCoinChange(coinDataLength, totalAmount, coinArr);
		System.out.println("combinations are : " + possibilities);
	}

	private static int generateCoinChange(int coinDataLength, int totalAmount, int[] coinArr) {

		if (totalAmount == 0)
			return 1;
		if (totalAmount < 0)
			return 0;
		if (coinDataLength <= 0 && totalAmount >= 1) {
			return 0;

		}

		return generateCoinChange(coinDataLength - 1, totalAmount, coinArr)
				+ generateCoinChange(coinDataLength, totalAmount - coinArr[coinDataLength - 1], coinArr);
	}

}

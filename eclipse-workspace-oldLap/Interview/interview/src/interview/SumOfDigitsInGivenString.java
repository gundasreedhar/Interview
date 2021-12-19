package interview;

public class SumOfDigitsInGivenString {
	public static int sumOfDigitsInGivenString(String str) {
		int sum = 0;

		char[] arr = str.toCharArray();
		for (char c : arr) {//48 - 0   // 65 - A   // 97 - a
			if (c >= 48 && c <= 57) {
 				
				// String ch =  String.valueOf(c);  //  very imp
				
				 sum+=Integer.parseInt(c + "");
				
				
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println("sum is : " + sumOfDigitsInGivenString("1df5r23"));
	}

}

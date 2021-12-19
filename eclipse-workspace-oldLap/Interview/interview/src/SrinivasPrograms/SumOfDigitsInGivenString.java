

public class SumOfDigitsInGivenString {
	public static void main(String[] args) {
		String str = "1df5r8rf9fyhgf6gbsgb9";// 1+5+8+9+6+9
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Integer.parseInt(str.charAt(i) + "");
			}
		}
		System.out.println(" Sum of digits in given " + sum);
	}
}

class SumOfNumberInGivenString1 {
	public static void main(String[] args) {
		String str = "123frd123qwe111";
		int sum = 0;
		int count = 0;
		boolean isDigit = false;
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
				isDigit = true;
			} else {
				if (isDigit) {
					sum = sum + Integer.parseInt(str.substring(i - count, i));
					isDigit = false;
					count = 0;
				}
			}
		}
		if (count > 0 && isDigit) {
			sum = sum + Integer.parseInt(str.substring(length - count, length));
		}
		System.out.println("sum of the numbers in the given string " + sum);
	}
}
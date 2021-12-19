package interview;

//declare the palindromeFlag = true;
//check for even or odd string
//mark the indexes correctely
//iterate using while and if u encounter any char mismatch make palindromeFlag = false and break the loop
public class PalindromForStringNumerAndMixedNumString {

	static void palindromeCheck(String str) {
		char[] arr = str.toCharArray();
		int length = arr.length;
		boolean palindromeFlag = true;
		for (int i = 0; i < length / 2; i++) {
			if (arr[i] != arr[length - 1 - i]) {
				palindromeFlag = false;
				break;
			}

		}

		if (palindromeFlag)
			System.out.println(str + " is palindrome");
		else
			System.out.println(str + " is not a palindrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "1saas1", str2 = "shreedhar", str3 = "!s_h@a@h_s!";
		// System.out.println("plindomre : " +palindromeCheck(str));
		palindromeCheck(str3);
	}

}

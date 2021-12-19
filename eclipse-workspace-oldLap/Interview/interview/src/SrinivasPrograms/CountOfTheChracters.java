package SrinivasPrograms;



public class CountOfTheChracters {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		freqCount(str);
	}

	public static void freqCount(String str) {
		str.replace(" ", "");
		while (str.length() > 0) {
			char ch = str.charAt(0);
			System.out.println(ch + " " + countChar(str, ch));
			str = str.replace("" + ch, "");
		}
	}

	public static int countChar(String str, char ch) {
		int count = 0;
		while (str.indexOf(ch) != -1) {
			count++;
			str = str.substring(str.indexOf(ch) + 1);
		}
		return count;
	}
}

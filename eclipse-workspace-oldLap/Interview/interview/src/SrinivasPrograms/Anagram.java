package SrinivasPrograms;



import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "god";
		String s2 = "dog";
		boolean status;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status = Arrays.equals(ch1, ch2);
		}
		if (status) {
			System.out.println("anagrams");
		} else {
			System.out.println(" not anagrams");
		}
	}
}

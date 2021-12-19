package SrinivasPrograms;

import java.util.Arrays;

public class SortCharacter {
	public static void main(String[] args) {
		String str = "rfvbh";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				// for descending ch[i] < ch[j]
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
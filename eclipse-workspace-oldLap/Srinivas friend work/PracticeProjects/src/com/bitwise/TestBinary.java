package com.bitwise;

public class TestBinary {

	public static void main(String[] args) {
		char ch = 'q';
		
		String binaryString = Integer.toBinaryString(ch);
		int length = binaryString.length() - 1;
		System.out.println("binaryString is " + length + ",  binaryString is " + binaryString);
		StringBuilder a = new StringBuilder();

		int firstIndex = Integer.valueOf(a.reverse().toString(), 2);
	}
}

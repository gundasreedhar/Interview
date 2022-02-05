package com.bitwise;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
		int testCases = InputReader.nextInt();
		for (int testCaseIndex = 0; testCaseIndex < testCases; testCaseIndex++) {
			run();
			InputReader.next();
		}
		OutputWriter.printToConsole();
	}
 
	public static void run() throws Exception {
		int numberOfStrings = InputReader.nextInt();
		List<String> sixCharStrings = new ArrayList<>(numberOfStrings);
 
		for (int index = 0; index < numberOfStrings; index++) {
			sixCharStrings.add(InputReader.next());
		}
 
		String encodedString = InputReader.next();
		StringBuilder a = new StringBuilder();
		StringBuilder b = new StringBuilder();
 
		for (String sixCharString : sixCharStrings) {
			a.setLength(0);
			b.setLength(0);
			char[] characters = sixCharString.toCharArray();
			for (int characterIndex = 0; characterIndex < characters.length; characterIndex++) {
				char character = characters[characterIndex];
				String binaryString = Integer.toBinaryString(character);
				int length = binaryString.length() - 1;
				char f = binaryString.charAt(length - characterIndex);
				a.append(binaryString.charAt(length - characterIndex));
				int index = length - ((characterIndex + 3) % 6);
				if (index < 0 || index > characters.length) {
					b.append('0');
				} else {
					b.append(binaryString.charAt(length - ((characterIndex + 3) % 6)));
				}
			}
			int firstIndex = Integer.valueOf(a.reverse().toString(), 2);
			int secondIndex = Integer.valueOf(b.reverse().toString(), 2);
			OutputWriter.printCharacter(encodedString.charAt(firstIndex));
			OutputWriter.printCharacter(encodedString.charAt(secondIndex));
		}
		OutputWriter.printNewLine();
	}
 
	@SuppressWarnings("unused")
	private static class InputReader {
		private static BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		private static StringTokenizer tokenizer = null;
 
		public static String next() throws Exception {
			if (tokenizer == null || !tokenizer.hasMoreElements()) {
				String line = inputReader.readLine();
				tokenizer = new StringTokenizer(line, " ");
			}
			return tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "";
		}
 
		public static char nextChar() throws Exception {
			return next().toCharArray()[0];
		}
 
		public static int nextInt() throws Exception {
			return Integer.parseInt(next());
		}
 
		public static double nextDouble() throws Exception {
			return Double.parseDouble(next());
		}
 
		public static float nextFloat() throws Exception {
			return Float.parseFloat(next());
		}
 
		public static BigInteger nextBigInteger() throws Exception {
			return new BigInteger(next());
		}
 
		public static BigDecimal nextBigDecimal() throws Exception {
			return new BigDecimal(next());
		}
	}
 
	@SuppressWarnings("unused")
	private static class OutputWriter {
		static StringWriter writer = new StringWriter();
		static BufferedWriter outputWriter = new BufferedWriter(writer);
 
		public static void print(String toPrint) throws Exception {
			outputWriter.write(toPrint);
		}
 
		public static void printNewLine() throws Exception {
			outputWriter.append('\n');
		}
 
		public static void printCharacter(char c) throws Exception {
			outputWriter.write(c);
		}
 
		public static void println(String toPrint) throws Exception {
			print(toPrint);
			outputWriter.write('\n');
		}
 
		public static void printToConsole() throws Exception {
			outputWriter.flush();
			StringBuffer buffer = writer.getBuffer();
			buffer = buffer.deleteCharAt(buffer.length() - 1);
			System.out.print(buffer);
		}
 
	}
}
 
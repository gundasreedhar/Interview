package com.java8.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestFlatMap {

	public static void main(String[] args) {
		String[][] data = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };
		// test1(data);
		test2(data);

		testSetWithFlatMap();

		testIntArrayWithFlatMap();

	}

	private static void testIntArrayWithFlatMap() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		Stream<int[]> streamArr = Stream.of(arr);
		IntStream intStream = streamArr.flatMapToInt(x -> Arrays.stream(x));
		intStream.forEach(System.out::println);

	}

	private static void testSetWithFlatMap() {

		Student student1 = new Student();
		student1.setName("Mohit");
		student1.addBook("Math Book");
		student1.addBook("Chemistry Book");

		Student student2 = new Student();
		student2.setName("Rohit");
		student2.addBook("Hindi Book");
		student2.addBook("Sanskrit Book");

		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);

		List<String> collect = students.stream().map(x -> x.getBook()).flatMap(x -> x.stream()).distinct()
				.collect(Collectors.toList());
		collect.forEach(System.out::println);

	}

	private static void test2(String[][] data) {

		Stream<String[]> stream1 = Arrays.stream(data);
		Stream<String> stream2 = stream1.flatMap(x -> Arrays.stream(x));
		Stream<String> stream3 = stream2.filter(x -> "a".equalsIgnoreCase(x));
		stream3.forEach(System.out::println);
	}

	private static void test1(String[][] data) {
		Stream<String[]> temp = Arrays.stream(data);
		Stream<String[]> stream = temp.filter(x -> "a".equalsIgnoreCase(x.toString()));
		stream.forEach(System.out::println);
	}
}

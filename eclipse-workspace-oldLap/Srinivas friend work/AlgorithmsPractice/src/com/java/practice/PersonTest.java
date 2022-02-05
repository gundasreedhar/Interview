package com.java.practice;

import java.util.Date;

public class PersonTest {
	public static void main(String[] args) {
		String s = "ss";
		Person james = new Person();
		james.setName("Mohit");
		james.setId(123);
		james.setDate(new Date(1981, 12, 1));

		Person same = new Person();
		same.setName("Mohit");
		same.setId(123);
		same.setDate(new Date(1981, 12, 1));

		Person purohit = new Person();
		purohit.setName("Mohit");
		purohit.setId(123);
		purohit.setDate(new Date(1981, 12, 2));

		System.out.println("james equals same " + james.equals(same));
		System.out.println("james equals puromhit " + purohit.equals(same));
		System.out.println("james compareTo puromhit " + purohit.compareTo(same));

	}
}

package com.java.practice;

import java.util.Date;

public class Person implements Comparable<Person> {
	private String name;
	private int id;
	private Date date;

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;

		if (obj != null && obj.getClass() != this.getClass())
			return false;

		Person person = (Person) obj;

		return (this.id == person.id) && (this.name != null && (this.name.equals(person.name))
				&& (this.date != null && (this.date.equals(person.date))));
	}

	@Override
	public int hashCode() {

		int result = 0;
		result = 31 * result + id;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (date != null ? date.hashCode() : 0);
		return result;
	}

	@Override
	public int compareTo(Person person) {
		return this.id - person.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

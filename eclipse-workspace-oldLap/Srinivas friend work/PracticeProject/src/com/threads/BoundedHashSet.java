package com.threads;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;
//Semaphore
public class BoundedHashSet<T> {

	Set<T> set;
	Semaphore semaphore;

	public BoundedHashSet(int bound) {
		set = new HashSet<>();
		semaphore = new Semaphore(bound);
	}

	boolean add(T object) throws InterruptedException {
		semaphore.acquire();
		boolean isAdded = false;
		try {

			isAdded = set.add(object);
			System.out.println("came here ");
			return isAdded;
		} finally {
			if (!isAdded) {
				semaphore.release();
			}
		}

	}

	boolean remove(T object) {
		boolean isRemoved = false;
		isRemoved = set.remove(object);
		if (isRemoved) {
			semaphore.release();
		}

		return isRemoved;

	}
	
	public static void main(String[] args) throws InterruptedException {
		
		BoundedHashSet<String> boundedHashSet = new BoundedHashSet<>(3);
		boundedHashSet.add("Mohit");
		boundedHashSet.add("Sohit");
		boundedHashSet.add("Rohit");
		//boundedHashSet.remove("Rohit");
		boundedHashSet.add("Lohit");
		
		
	}
}

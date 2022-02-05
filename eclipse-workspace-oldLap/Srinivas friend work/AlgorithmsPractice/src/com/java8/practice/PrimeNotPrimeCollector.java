package com.java8.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNotPrimeCollector {

	public static void main(String[] args) {
		int n = 20;
		Map<Boolean, List<Integer>> primeNotPrimeMap = IntStream.rangeClosed(2, n).boxed()
				.collect(Collectors.partitioningBy(candidate -> isPrime(candidate)));
		
		System.out.println(primeNotPrimeMap);
	}

	static boolean isPrime(int candidate) {
		int candidateRoot = (int) Math.sqrt((double) candidate);
		return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> (candidate % i == 0));

	}
}

package com.java8.practice;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {

		Function<Integer, Integer> f = x -> x + 1;
		Function<Integer, Integer> g = x -> x * 2;

		Function<Integer, Integer> h = f.andThen(g);
		
		int res = h.apply(1);
		
		System.out.println("res is " + res);
		
	   Function<Integer, Integer> h1  = f.compose(g);
	   int res2 = h1.apply(1);
	   
	   System.out.println("res2 is " + res2);
	}

}

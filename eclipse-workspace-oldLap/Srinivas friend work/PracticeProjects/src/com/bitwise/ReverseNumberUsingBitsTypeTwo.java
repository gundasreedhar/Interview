package com.bitwise;

import java.util.Scanner;

public class ReverseNumberUsingBitsTypeTwo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int reverse_n = n;
		int count = countNumberOfBits(n);
		n = n>>1;
		while(n>0){
			reverse_n= reverse_n<<1;
			reverse_n = reverse_n | n&1;
			n = n>>1;
			count--;
			
		}
		
		reverse_n = reverse_n<< count;
		
		System.out.println("reverse is " + reverse_n);
		
		
	}
	
	 static int countNumberOfBits(int n){
			
		 n = n| n >> 1;
		 n = n| n >> 2;
		 n = n| n >> 4;
		 n = n| n >> 8;

		 int x = n+1>>1;
		 int logX = (int) (Math.log(x)/Math.log(2));
		 return logX+1;
		 }

}

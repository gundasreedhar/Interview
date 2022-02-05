package com.bitwise;

import java.util.Scanner;
public class ReverseNumberUsingBitsTypeOne{


   public static void main(String args[]){
   
      Scanner sc =  new Scanner(System.in);
	  int n = sc.nextInt();

      int numberOfbits = countNumberOfBits(n);	 

	  int s = numberOfbits-1;
	  int m =1;
	  int res = 0;
     for(int i=0;i<numberOfbits;i++){
	    
		int x = n&m;
		if(x>0){
       int  k = s-i;
		res = res | (1<<k);
		}
		m = m*2;
	 }

    System.out.println("res is " + res);	 
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
package com.bitwise;

import java.util.Scanner;

public class PrintMultipleTimes{

   public static void main(String args[]){
   
     Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 StringBuilder str = new StringBuilder();
	 str.append("W");
	 
	 for(int i=0;i<n;i++){
	   str.append("o");
	 }
	 
	 str.append("w");
	
	
	System.out.println(str);
   }

}
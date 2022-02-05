package com.bitwise;

import java.util.*;

public class Divisible{


  public static void main(String args[]){
  
     Scanner sc = new Scanner(System.in);
	 int numberOfTestcases = sc.nextInt();
	 
	   while(numberOfTestcases > 0){
	     int n = sc.nextInt();
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 int i =1;
		 while(i<n){
		 if(i%x == 0 && i%y != 0){
		    System.out.print(i);
			System.out.print(" ");
		 }
		 
		 i++;
	   }
	   	   System.out.println();
	   	   numberOfTestcases--;
	   }
   
  }

}
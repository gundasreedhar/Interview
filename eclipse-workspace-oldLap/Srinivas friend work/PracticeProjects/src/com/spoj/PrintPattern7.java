package com.spoj;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class PrintPattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int operations = sc.nextInt();
		LocalDateTime start = LocalDateTime.now();

		
		while(operations>0){
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int s = sc.nextInt();

		int in1S = s - 1;
		int in2S = s;

		String var1S = "/";
		String var2S = "\\";

		s = 2 * s;

		x = x * s;
		y = y * s;

		int m = 0;
		int in1T = in1S;
		int in2T = in2S;
		String var1T = var1S;
		String var2T = var2S;
		for (int i = 0; i < x; i++) {
			
			int in1 = in1T;
			int in2 = in2T;
			String var1 = var1T;
			String var2 = var2T;
			for (int j = 0; j < y; j++) {

				if (j == in1) {
					System.out.print(var1);
					in1 = in1 + s;
				}

				else if (j == in2) {
					System.out.print(var2);
					in2 = in2 + s;
				}

				else {
					System.out.print(".");
				}
			}

			System.out.println();
			if (m == s - 1) {
				in1T = in1S;
				in2T = in2S;
				var1T = var1S;
				var2T = var2S;
				m = 0;
			}
			

			else {

				m++;
				if (in1T > 0) {
					in1T = in1T-1;
					in2T = in2T+1;

				}

				else if (in1T == 0 && var1T == "/") {
					var1T = "\\";
					var2T = "/";
				}

				else if (in1T == 0 && var1 == "\\") {
					in1T = in1T+1;
					in2T = in2T-1;
				}
			}
			
			
		}
		
		System.out.println();
		operations--;
	}

		LocalDateTime end = LocalDateTime.now();
		Duration durationSrchParse = Duration.between(start, end);
		System.out.println("time taken in ms   " + durationSrchParse );

	}

}

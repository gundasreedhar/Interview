package com.dice.roll;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lkk {
	
	public static void main(String[] args) {
		//String[] result=   "4 D 6+3 D 4-2 D 7 ".split("[-+*/]");
		String[] result=   "3D8 + 3D10 - 2D12".split("[-+*/]");
		
		String data = "4DF ";
		data = data.trim();
		Pattern pattern = Pattern.compile("\\s");
		Matcher matcher = pattern.matcher(data);
		boolean isWhitespace = matcher.find(); 
		
		
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}

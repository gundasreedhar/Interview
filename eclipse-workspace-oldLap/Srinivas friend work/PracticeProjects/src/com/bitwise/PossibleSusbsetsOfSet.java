package com.bitwise;

import java.util.ArrayList;
import java.util.List;

public class PossibleSusbsetsOfSet {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("a");
		li.add("b");
		li.add("c");
		
		int n = li.size();
		int nTotal = 1<<n;
		
		for(int i=0;i<nTotal;i++){
			for(int j=0;j<n;j++){
				
				if((i & (1<<j)) == 1<<j)
					System.out.print(li.get(j) +  " ");
			}
			System.out.println();
		}

	}

}

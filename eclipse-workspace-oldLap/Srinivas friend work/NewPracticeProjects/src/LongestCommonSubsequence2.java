import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import java.util.*;
import java.util.Set;
import java.util.TreeMap;

public class LongestCommonSubsequence2 {
	// Returns length of LCS for X[0..m-1], Y[0..n-1]
	static void lcs(String X, String Y, int m, int n) {
		int[][] L = new int[m + 1][n + 1];

		// Following steps build L[m+1][n+1] in bottom up fashion. Note
		// that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1]
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					L[i][j] = 0;
				else if (X.charAt(i - 1) == Y.charAt(j - 1))
					L[i][j] = L[i - 1][j - 1] + 1;
				else
					L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
			}
		}

		// Following code is used to print LCS
		int index = L[m][n];
		int temp = index;

		// Create a character array to store the lcs string
		char[] lcs = new char[index + 1];
		lcs[index] = '+'; // Set the terminating character

		// Start from the right-most-bottom-most corner and
		// one by one store characters in lcs[]
		int i = m, j = n;
		while (i > 0 && j > 0) {
			// If current character in X[] and Y are same, then
			// current character is part of LCS
			if (X.charAt(i - 1) == Y.charAt(j - 1)) {
				// Put current character in result
				// lcs[index - 1] = X.charAt(i - 1);

				// reduce values of i, j and index
				i--;
				j--;
				index--;
			}

			// If not same, then find the larger of two and
			// go in the direction of larger value
			else if (L[i - 1][j] > L[i][j - 1]) {
				lcs[index - 1] = X.charAt(j - 1);
				i--;
			} else {
				lcs[index - 1] = Y.charAt(i - 1);
				j--;

			}
		}

		// Print the lcs
		System.out.print("LCS  is ");
		StringBuffer strBuffer = new StringBuffer();
		for (int k = 0; k <= temp; k++) {
			strBuffer.append(lcs[k]);
			// System.out.print(lcs[k]);
		}

		String data = strBuffer.toString();
		System.out.println(data);

	}

	// driver program
	public static void main(String[] args) {
		String X = "I am using HackerRank to improve programming";
		String Y = "am HackerRank to improve";
		/*int m = X.length();
		int n = Y.length();
		lcs(X, Y, m, n);
*/
		findMissingWords(X, Y);
	}

	private static void findMissingWords(String x, String y) {
		String arr1[] = x.split(" ");
		String arr2[] = y.split(" ");
		int firstInt = 0;
		Map<String, Integer> firstMap = new TreeMap();
		for (int i = 0; i < arr1.length; i++) {
			firstMap.put(arr1[i], firstInt++);
		}

		int secondInt = 0;
		Map<String, Integer> secondMap = new TreeMap<>();
		for (int i = 0; i < arr2.length; i++) {
			secondMap.put(arr2[i], secondInt++);
		}

		Iterator<Map.Entry<String, Integer>> iter = firstMap.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			if (secondMap.containsKey(entry.getKey())) {
				iter.remove();
			}

		}

		
		List<String> outputArr = new ArrayList<>();
		
		Set<Map.Entry<String, Integer>> set = firstMap.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );
        
        
		for (Map.Entry<String, Integer> mapData : list) {
		

			outputArr.add(mapData.getKey());
			
		}
		
		
	

	}
}

// Contributed by Pramod Kumar
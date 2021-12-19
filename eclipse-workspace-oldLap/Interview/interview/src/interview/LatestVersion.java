package interview;


import java.util.Arrays;

public class LatestVersion {

	public static void main(String[] args) {
		String[] thisIsArray = { "java.1.10.8", "java.1.8.8", "java.1.01.90", "java.1.107.71", "java.1.75.8" , "java.1.8.9"};
		Arrays.sort(thisIsArray);
		for (String element : thisIsArray) {
			System.out.println("Arrays sort " + element);
		}
		System.out.println("latest version is : " + thisIsArray[thisIsArray.length-1]);
		
		//String str=new String (".");
		System.out.println("0.".compareTo("01"));  //  compareTo method campares the string character by character
													// it substracts the character's ascii values and return the result 
		
		
		System.out.println("The latest verison is "
								+getLatestVersion(thisIsArray));
	}

	static String getLatestVersion(String[] strArray) {
		String latest = strArray[0];
		for(String str : strArray)
		{
			if(latest.compareTo(str) < 0)
				latest = str;
		}
		
		return latest;
	}

	
}

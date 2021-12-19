package interview;

import java.util.HashMap;
import java.util.Map;

public class NoOfEachAndVowelsAndConsonants {
	static public void calcNoOfVowelsAndConsonants(String str)
	{
		String reGen = str.replace(" ", "");
		Map<String,Integer> noOfVowels = new HashMap<String,Integer>();
		Map<String,Integer> noOfConsonents = new HashMap<String,Integer>();
		for(int i = 0 ; i <= reGen.length()-1 ; i++ )
		{
			char letter = reGen.charAt(i);
			if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'||
					letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
			{
				if(noOfVowels.containsKey(letter+""))  // imp to add "" 
					noOfVowels.put( letter+"",noOfVowels.get(letter+"")+1 );
				else 
					noOfVowels.put( letter+"",1 );
					
			}
			else {
				if(noOfConsonents.containsKey(letter+""))
					noOfConsonents.put( letter+"",noOfConsonents.get(letter+"")+1 );
				else 
					noOfConsonents.put( letter+"",1 );
			}
			
		}
		
		System.out.println("number of vowels occurences : ");
		for(String letter : noOfVowels.keySet())
		{
			System.out.println(letter + " : " + noOfVowels.get(letter));
		}
		
		System.out.println("number of Coonsonent occurences : ");
		for(String letter : noOfConsonents.keySet())
		{
			System.out.println(letter + " : " + noOfConsonents.get(letter));
		}
		
	}
	public static void main(String[] args) {
		
		calcNoOfVowelsAndConsonants("shreedhar");
	}

}

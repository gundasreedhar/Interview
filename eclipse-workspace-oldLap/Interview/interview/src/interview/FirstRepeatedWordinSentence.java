package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstRepeatedWordinSentence {
		static public String firstRepeatedWordinSentence(String str)
		{
			String[] words = str.split(" ");
			Set<String> nonRepeatedwords = new HashSet<>();
			
			for(String word : words)
			{
				//keep adding the newer elements. 
				//when u encounter any element that is already present in the set then return that element
				if(!nonRepeatedwords.contains(word))
					nonRepeatedwords.add(word);
				else 
					return word;
			}
			return "";
		}
		
	public static void main(String[] args) {
		String word = firstRepeatedWordinSentence("my name is shreedaf name");
		if( word != "" )
			System.out.println("First repeated word in the sentence is : " + word);
		else 
			System.out.println("There is no word that is repeating \nAll the words in the string is non repeating only");
	}

}

package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/*
 * iterate through all the words in the sentence
 * if u don't find that word in the nonReapeatedList, then add it into the list
 * if u find the word in the nonReapeatedList then remove from the nonReapeatedList
 * now here there is chance that again the repeated word might come since that word is removed from nonReapeatedList so that will get added in to nonReapeatedList
 * so to avoid that we have to maintain the set of repeatedWords.
 * when we encounter the repeated word then we have to make it to go to next iteration  
 */
public class FirstNonRepeatedWordInsentence {

	static public void firstNonRepeatedWordInSentence(String str)
	{
		
		String[] words = str.split(" ");
		List<String> nonRepeated = new ArrayList<>();  // list coz to preserve the insertion order 
		Set<String> repeated = new HashSet<>();  //  to maintain the set of repeated words 
												// since we are removing the repeated word from non-repeated List obj 
		 									   // and prevent the repeated word from adding again into the non repeated list obj
		
		
		for(String word : words)
		{
			
			if(repeated.contains(word))
				continue;
			
			if(nonRepeated.contains(word))
			{
				nonRepeated.remove(word);
				repeated.add(word);
			}
			else
				nonRepeated.add(word);
		}
		
		System.out.println("The first non-repeated word in the given string is : "+nonRepeated.get(0));
		
	}
	public static void main(String[] args) {
		String str = "my my me you name is shreedhar is shreedhar name you";
		firstNonRepeatedWordInSentence(str);
	}

}

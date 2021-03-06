package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class NthRepeatedAndNonrepeatedElementForNumber {
	public static void nthRepeatedAndNonrepeatedElement(int[] arr, int n)
	{
		List<Integer> nonReapeatedList = new ArrayList<Integer>();
		List<Integer> repeatedList = new ArrayList<Integer>();
		for(int a : arr )
		{
			if(repeatedList.contains(a))	// since we remove the repeated once from nonReapeatedList so there might be chance that again the same charcter might come and gets added into nonReapeatedList
				continue;
			
			if(nonReapeatedList.contains(a)){
				nonReapeatedList.remove((Object)a);
				repeatedList.add(a);
			}
			else 
				nonReapeatedList.add(a);
		}
		
		System.out.println("Repeated elements : " + repeatedList);
		System.out.println( "Non-repeated elements : " + nonReapeatedList);
		System.out.println("---------------------------");
		System.out.println(n + " Repeated element: " + repeatedList.get(n-1));
		System.out.println(n + " Non-repeated element : " + nonReapeatedList.get(n-1));
	}
	public static void main(String[] args) {
		int[] arr = {12,3,4,6,6,4,3,2};
		nthRepeatedAndNonrepeatedElement(arr,2);
	}

}



class NthRepeatedAndNonrepeatedElementForCharacter
{
	public static void nthRepeatedAndNonrepeatedElementForCharacter(String str)
	{
		char[] arr = str.toCharArray();
		List<Character> repeated = new ArrayList<Character>();
		List<Character> nonRepeated = new ArrayList<Character>();
		
		// when u r dealing with the char type data then u must and use Character obj
		// becoz when u are using remove method for aaraylist object using char type in it, it wil use the ASCII value of char and considers it as index
		// will get array index out of bound excp
		// when u put the Wrapper or user defined object.. it removes the object correctly from AL
		for(Character ch : arr )
		{
			//Character ch = c;
			
			if(repeated.contains(ch))
			{
				continue;
			}
			
			if(!nonRepeated.contains(ch))
			{
				nonRepeated.add(ch);
			}
			else 
			{	
				nonRepeated.remove(ch);
				repeated.add(ch);
			}
		}
		
		System.out.println("repeated : " + repeated);
		System.out.println("non-repeated : " + nonRepeated);
	}
	
	public static void main(String[] args) {
		String str = "aaabbbcccdddxyz";
		nthRepeatedAndNonrepeatedElementForCharacter(str);
	}
}

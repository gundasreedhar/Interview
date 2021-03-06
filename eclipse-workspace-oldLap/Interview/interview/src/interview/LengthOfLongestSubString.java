package interview;

public class LengthOfLongestSubString {
	
	public static int lengthOfLongestSubString(String str)
	{
		int result = 0;
		boolean [] flag = new boolean [256];
		int start = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			char current = str.charAt(i);
			
			if(flag[current])
			{
				result = Math.max(result,i-start);
				
				for(int k = start ; k < i ; k++)
				{
					// until the matching char occurs make the chars that are before that matching char to false
					// bcoz how ever the length will be less then it is being computed.
					//  and also to prevent the matching of char for next substring, even if it is not there 
					if(str.charAt(k) == current)
					{
						// compute the start
						start = k +1;
						break;	// to prevent the next chars from making false  :: VERY IMPORTANT
					}
					else {
						// make the char before to false
						flag[str.charAt(k)] = false;
					}
					
				}
				
			}
			else
			{
				flag[current] = true;
			}
		}
		
		result = Math.max(result, str.length()-start);
		
		
		return result;
	}

	public static void main(String[] args) {
		
		String s = "ACBBA EIBCXPOQWRL"; //"softwar development in test developmentt";
		System.out.println("The length longest sub String is : " + lengthOfLongestSubString(s));
	}

}

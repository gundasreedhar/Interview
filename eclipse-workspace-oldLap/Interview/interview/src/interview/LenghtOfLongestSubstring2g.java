package interview;

public class LenghtOfLongestSubstring2g {
	static public int lengthOfLongestSubstring(String s) {
		boolean[] flag = new boolean[256];

        int result = 0;
        int start = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++)
        {
            char current = arr[i];
            if (flag[current]) 
            {
                result = Math.max(result, i - start);
                
                
                // what is this loop does
                for (int k = start; k < i; k++) 
                {
                    if (arr[k] == current) 
                    {
                        start = k + 1;
                        break;
                    }
                    flag[arr[k]] = false;
                }
            }
            else
            {
                flag[current] = true;
            }
        }
        result = Math.max(arr.length - start, result);  // if suppose the substring present at the end there is no repeating char

        return result;
	}
	
	public static void main(String args[])
	{
		System.out.println(lengthOfLongestSubstring("ACBBA EIBCXAPOQWRL"));//ACBBAEIBCXA
	}
}

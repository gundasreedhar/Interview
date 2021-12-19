
package interview;

import java.util.HashMap;
import java.util.Map;

class FindTwoForTargett {
	
	public void findTwo(int []  arr, int targer)
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int num : arr)
		{
			if(map.containsKey(num))
			{
				System.out.println( num + " and " + map.get(num) + " leads to " + targer);
			}
			else {
				map.put(targer-num,num);
			}
		}
	}
}
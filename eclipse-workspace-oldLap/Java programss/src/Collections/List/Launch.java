import java.util.ArrayList;
import java.util.Iterator;
class Launch 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);

		System.out.println("Fetching the list using the Iterator class:");
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();

		System.out.println("Fetching the List using the Lambda Expression:");
		list.forEach( n  -> System.out.println(n));
		System.out.println();

		System.out.println("Fetching the List using the get() method:");
		for(int i = 0 ;  i < list.size() ; i++ )
		System.out.println(list.get(i));
		
	}
}
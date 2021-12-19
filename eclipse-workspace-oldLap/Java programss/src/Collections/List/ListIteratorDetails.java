//ListIterator Cursor
/*
  Features:
  	1. Applied only for ArrayList, so Not a Universal Cursor.
  	2. Can navigate both Forward and Backward directions.
  	2. Can remove, replace, and add the elemnts in collection object.
  	
  Methods:
  	Forward methods,
  		1. hasNext()
  		2. next() // ..this method not only returns obj that cursor pointing to but also shifts the 
  					   cursor to the next object in the collection. (Very important)
  		3. nextIndex()
  	Backward methods,
  		1. hasPrevious()
  		2. previous()
  		3. previousIndex()
  	Extra other operation,
  		1. remove()
  		2. set(Object obj) // ..wil replace with obj 
  		3. add(Object obj) // ..will add obj next to the cursor pointing
  		
  Important Note:
  		1. if u are iterating through collection using while loop with hasNext() at the condition
  			then you have to use next() method, if not it goes to infinite loop. i.e., 
  			 -->use hasNext() with next() in while loop to avoid infinite loop.
  			 	This applies for both Iterator and ListIterator cursor as well  
  		
  		
 */
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		 al.add(1);
		 al.add("shree");
		 al.add("king");
		 al.add(4.35);
		 al.add("shree");
		 
		 ListIterator itr = al.listIterator();
		 // listIterator() returns the ref for the ListIterator inerface implemented class
		 // Below stmt gives the name of the anonymous class 
		 System.out.println(itr.getClass().getName());
		 //java.util.ArrayList$ListItr

		 while(itr.hasNext())
		  {
			  /*if(itr.next().getClass().getName().equalsIgnoreCase("java.lang.String"))
			  {
				  itr.remove(); // removes all the String objects
				  itr.set("String object"); // sets the string objcets with the spcified objects
				  itr.add("String object prev"); // adds next to string object
			  }*/
			 System.out.println(itr.nextIndex());
			  
		  }
		  System.out.println(al);
		 
	}

}

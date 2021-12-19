// Cursors in java
/*
   Cursors in java are useful to retrive the objects from the collection
   we have,
     1. Enumeration cursor. (Out dated)
     2. Iterator cursor. (read and remove for all the Collection implemented classes)
     3. ListIterator cursor.(everything but only for ArrayList)
     4. using lambda exprn (best only to read for all the collection).  
*/

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorAndLambdaCursorsDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		 al.add(1);
		 al.add("shree");
		 al.add("king");
		 al.add(4.35);
		 al.add("shree");
		 
		 /* retrieving using lambda exprn
		  * useful only for accessing the collecion elemnts very Easily. 
		  * No modification is possible on collection object.
		     al.forEach(n -> 
			 {
			 	//multiple statements syntax
				 System.out.println(n); 
			 }
			);
		 */
		  
		  // using Iterator interface
		  Iterator itr = al.iterator();
		  // iterator is the method present in the Iterable interface, there by available in collecion interface 
		  // iterator method returns the ref of anonymous class obj that implements Iterator interface.
		  // below stmnt gives anonymous class name.
		  System.out.println(itr.getClass().getName()); // java.util.ArrayList$Itr
		  
		  while(itr.hasNext())
		  {
			  //System.out.println(itr.next().getClass().getName());  
			  if(itr.next().getClass().getName().equals("java.lang.String"))
			  {
				  itr.remove(); // using remove to remove all the String objects in collection obj
			  }
		  }
		  System.out.println(al);
	}

}

/*
Methods:

 hasNext() : Boolean
 next() : Object
 remove() : Boolean
 
===============================================================================================
Advantage:
	1. Applicable for all the collection implemented class objs, "Universal Cursor".
	
===============================================================================================
Limitations:
	1. moves only forward direction.
	2. we can remove the collection obj but we cant add or replace with new colection obj.
	3. Navigation Not possible.
	
	So, to remove this limitations in the Iterator cursor we have to go ListIterator cursor
	 where this cursor applicable only for the ArrayList class objects 
===============================================================================================
*/
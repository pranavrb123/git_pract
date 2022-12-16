package collection_Practice;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector_class
{
	
	public static void main(String[] args) 
	{
		
		// vector is legacy class
		
		// any no of duplicates are allowed 
		// any no of null values are allowed 
		// order of insertion is maintained 
		// default capacity is 10
		// data structure doubly 
		// incremental capacity (current capacity *2)
		// best choice - retrieval operation (random access interface is used to quicker retrieval)
		// worst choice - Manipulation operatiojn like delete and add in vector 
		// storage type- Index
		
		
		
		
		
		Vector v1 = new Vector();
		
		
		v1.add("Pranav");
		v1.add(150);
		v1.add('W');
		v1.add(200.5f);
		// multiple duplicate 
		v1.add(150);
		v1.add('W');
		
		// multiple null value 
		
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(null);
		
		
		System.out.println(v1);
		
		// to check the vector is empty or not 
		
		System.out.println(v1.isEmpty());  // boolean 
		
		System.out.println(v1.size());   // int
		
		System.out.println(v1.contains(null));  // true boolean return 
		
		// to add the value to the vector  right shift operator 
		
		v1.add(2,"hashmap");		
		System.out.println(v1);
		
		// to remove the vector 
		
		v1.remove(2);
		System.out.println(v1);
		
		// to set the value for specific index
		
		v1.set(2, "good evening");
		System.out.println(v1);
		
		// to find the index of specific object 
		
		System.out.println(v1.indexOf(150));  // 1 let there may be any number of similar data present in vector it only considers
		                                      // first value
		
		System.out.println(v1.get(0));  // object at 0 index 
		
		System.out.println(v1.lastIndexOf(null));
		
		System.out.println("-----------------------------------------------------------------------------------------");
		// iterator  cursor 
		// create the object of the iterator cursor
		
		Iterator itr = v1.iterator();
		
		while(itr.hasNext())  // boolean
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		
		// for each loop
		
		for( Object itr1:v1)
		
		{
			System.out.println(itr1);
		}
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		//ListIterator cursor 
		
		ListIterator ltr = v1.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

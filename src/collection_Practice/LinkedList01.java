package collection_Practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList01 
{

	public static void main(String[] args) 
	{
		
		
		// create the object of linked list Implements class
		
		LinkedList lkd = new LinkedList();  // always check the class name should be different 
		
		// add values to the Linked list 
		
//		linked list allows any no of duplicate values 
//		linked list allows any no of null values 
//		linked list order of insertion is maintained 
//	    no default capacity 
//		data structure Linear 
//		best choice data manipulation
//		worst choice data retrieval 
//		storage type index 
		
		
		// lets start 
		
		lkd.add("Pranav");                // this add has boolean return type 
		lkd.add('B');
		lkd.add(2000);
		lkd.add(90.5f);
		
		System.out.println(lkd);

		// duplicate values 
		
		lkd.add(2000);
		lkd.add(90.5f);
		
		// multiple null values 
		
		lkd.add(null);
		lkd.add(null);
		
		// to ceheck that the linked list is empty or not 
		
		System.out.println(lkd);
		
		
		System.out.println(lkd.isEmpty());  // returns false 
		System.out.println(lkd.size());    // returns int value
		
		System.out.println(lkd.contains(90.5f));  // true returns boolean values
		
		// now to add the object in between the Linkedlist 
		
		lkd.add(6, "Vrush");   // this add has void return type 
		System.out.println(lkd);
		
		// now to remove the object 
		
		lkd.remove(8);
		System.out.println(lkd);
		
		// to set the value 
		lkd.set(7, 'T');
		System.out.println(lkd);
		
		System.out.println(lkd.get(1));  // B
		
		System.out.println(lkd.indexOf("Vrush"));
		
		System.out.println("---------------------------------------------------------------------------------------------");

		
		Iterator ltr = lkd.iterator();
		
		while(ltr.hasNext()) // boolean of iterator 
		
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("---------------------------------------------------------------------------------------------");
		
		for( Object ltr1:lkd)
		{
			System.out.println(ltr1);
		}
		
		// List iterator cursor 
		
		System.out.println("---------------------------------------------------------------------------------------------");
	
		
		ListIterator lst = lkd.listIterator();
		
		while(lst.hasNext())
		{
			System.out.println(lst.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

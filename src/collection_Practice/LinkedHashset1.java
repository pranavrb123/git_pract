package collection_Practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset1 
{

	public static void main(String[] args) 
	{
		
		
		// create the object of the Linked hash set
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		// create add the values to the LInked hashset 
		// does not allow duplicate 
		// only allows 1 null value
		// order of insertion is maintained
		// no default capacity 
		// data structure hybrid (linear+hash table)
		// best choice to remove the duplicate if the order of insertion is mandaotry
		// storage type hashtable 
		
		lhs.add("Pranav");
		lhs.add("Rajendra");
		lhs.add("Bhaskare");
		lhs.add('A');
		lhs.add(10000);
		
		
		System.out.println(lhs);
		
		// we try to add duplicate values 
		
		lhs.add("Pranav");
		lhs.add("Rajendra");
		
		// add null values 
		
		lhs.add(null);
		lhs.add(null);   // does not accept null value only accepts single null value
		
		System.out.println(lhs);
		
		System.out.println(lhs.isEmpty());
		
		System.out.println(lhs.size());  // 6 
		
		System.out.println(lhs.contains("Pranav"));  // true 
		
		// to insert value does not allow as default capacity we dont know 
		
//		lhs.add(2,'F');
//		System.out.println(lhs);
		
		// to remove the value from LinkedHashSet  
		
		lhs.remove(null);
		System.out.println(lhs);  // does not remove 
		
//		lhs.set(3,85.5f);
//		System.out.println(lhs);  // it is undefined for LInked  hash set 
		
		
//		System.out.println(lhs.indexOf("Pranav"));
		
		// to use the iterator cursor 
		System.out.println("----------------------------------------------------------");

		
		Iterator itr = lhs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("----------------------------------------------------------");
		
		
		for(Object lhs1:lhs)
		{
			System.out.println(lhs1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

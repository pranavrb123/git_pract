package collection_Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List01 
{

	
	public static void main(String[] args)
	{
		
	// order of insertion is maintained 
		ArrayList ar = new ArrayList();
		
		
		ar.add("Pranav");   // add method of the array list
		ar.add(114);        // add method of arrayList and returns boolean 
		ar.add('A');
		ar.add(95.5f);
		
		ar.add("Pranav");
		ar.add(114);
		
		ar.add(null);
		ar.add(null);
		ar.add(null);
		
		
		
		
		
		System.out.println(ar);
		
		System.out.println(ar.isEmpty());  // boolean return
		
		System.out.println(ar.size());    //  int array 9 ArrayList method 
		
		System.out.println(ar.contains(114));  // true boolean return type 
		
		System.out.println(ar.contains("pranav"));  // true boolean false as it is case sensitive
		
		
//		to add the value inside the arraylist 
		
		ar.add(3, "Hi Every one");
		System.out.println(ar);    // here the right shift operation has taken place the 95.5 has right shifted
		
		
		// to remove the value from the array list 
		
		ar.remove(3);          // return object 
		System.out.println(ar);  // remove the value Hi every one inside the arrays list left shift operator
		
		ar.set(6, "vrusha");        // return object 
		System.out.println(ar);
		
		System.out.println(ar.get(6));  // returns object at specific index 
		

		System.out.println(ar.indexOf("vrusha"));       // returns int index value 
		
		System.out.println("----------------------------------------------------------------------------------------------");
		// use of universal cursor iterator 
		
		Iterator itr = ar.iterator();  // interface 
		
		while(itr.hasNext())  // boolean return type   
		{
			System.out.println(itr.next());// return type iterator 
		}
		
		System.out.println("----------------------------------------------------------------------------------------------");

		
		for(Object itr1:ar)  // take the ar object only and not the itr object of iterator 
		{
			System.out.println(itr1);
		}
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		// use of listIterator 
		
		ListIterator ltr = ar.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}      
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

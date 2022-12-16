package collection_Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet01
{
	public static void main(String[] args) 
	{
		
		TreeSet ts = new TreeSet();
		// balanced Tree set
		
		ts.add(100);
		ts.add(200);
		ts.add(300);
		ts.add(400);
		ts.add(500);
		ts.add(600);
		
		
		
		
		System.out.println(ts);  // only allows homogeneous data only is accepted 
		
		ts.add(100);
		System.out.println(ts);  // does not allow dupicate value 
		
		// lets check for null values 
		
//		ts.add(null);  no null value is allowed 
	 
//		System.out.println(ts);  // gives error in the console 
		
		
		System.out.println(ts.isEmpty());  // false 
		System.out.println(ts.size());   // 5
		System.out.println(ts.contains(400));   // True 
		
		
		// to add the value to the tree set not allowed 
		
//		ts.add(1,1500);
//		System.out.println(ts);
		
	
		// to remove the value .
		
		ts.remove(200);
		System.out.println(ts);  // removes 200 from the Tree set
		  
		// to set the value to existing index 
		
//		ts.set(2,600);
//		System.out.println(ts);  // not allowed 
		
	System.out.println(ts.pollFirst());   // to remove the last value 
	
		System.out.println(ts.pollLast());  // to remove the first value 
		
		System.out.println(ts);
		
		System.out.println(ts.last());     // to print the last value 
		
		System.out.println(ts.first());    // to print the first value
		
		System.out.println("----------------------------------------------------------------------");
		
		Iterator itr = ts.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----------------------------------------------------------------------");
		
		for(Object ts1:ts)
		{
			System.out.println(ts1);
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package collection_Practice;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset01 
{

	// implements class of Set interface
	public static void main(String[] args) 
	{
		
	
	
	               HashSet hs = new HashSet();
	
	// hash set does not allow any no of duplicates
	// only allows 1 null values
//     order of insertion is random 
//	   data structure = Hash tabel
//	   no default capacity 
//	   best choice to remove the duplicate values if the order of insertion is not mandatory
//	   storage type = Hash Table  
	               

	               hs.add("Shree");
	               hs.add("Hi good Evening");
	               hs.add('R');
	               hs.add(8000);
	               
	               // to check if it allows any duplicate values 
	               
	               hs.add("Shree");
	               hs.add("Hi good Evening");
	               
	               System.out.println(hs);  // no it does not allow any duplicate values 
	               
	               // lest ckeck the null values 
	               
	               hs.add(null);
	               hs.add(null);
	               
	               System.out.println(hs);  // allows only 1 null values 
	               
	               // Order of Insertion is Random not Maintained 
	               
	               // lets check whether the hashset is empty or not 
	               
	               System.out.println(hs.isEmpty());  // false boolean return
	               // lest check the size 
	               System.out.println(hs.size());  // 5 only no duplicates are ADDED and no NULL valuesmore then 1
	               // lets check the contains of the hash set 
	               
	               System.out.println(hs.contains(null));  // true boolean value returns 
	               
	               // to add the values in the hashset 
	               // we cannot add the values in betweent the Hashset as we dont know the default capacity as well as the order of insertion
//	               hs.add(0,8550); 
//	               System.out.println(hs);
	               
	               // we check the remove function 
	               
	               hs.remove('R');  // enter the value not the index 
	               System.out.println(hs);  // it wont remove the values 
	               
	               // to set the values 
	               
//	               hs.set(1,"Pranav");
//	               System.out.println(hs);   it wont allow to set the new values to the existing index 
	               
	               // lets get the object at the specific index like charat function
	               
//	               System.out.println(hs.get(0)); // it wont allow to get the values for specific index like char at 
	               
	            // lets check for the index value 
	               
//	               System.out.println(hs.indexOf(null));  // it is undefined for hashset/ wont allow 
	       System.out.println("----------------------------------------------------------------------------------");        
	           
	               Iterator itr = hs.iterator();
	               
	               while(itr.hasNext())
	               {
	            	   System.out.println(itr.next());
	               }
	
	    	       System.out.println("----------------------------------------------------------------------------------");        

	for(Object hs1:hs)
	{
		System.out.println(hs1);
	}
	
	//list iterator is not supported here 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}

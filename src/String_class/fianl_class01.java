package String_class;

public class fianl_class01
{

	public static void main(String[] args) 
	{
		
	
	 String s1 = "ABC";
	
	 String s2 = "ABC";
	
	 // string object are immutable/cant change 
	 // if we even want to change forcefully
	 
	// s1 = s1+"DE"; // if we compare the s1==s2 it gives the false value as the reference/pointer is changed
	 
	 
	 
	// here even if we change the value of the s1 the object is not changed only reference/pointer is
	 // changed to new object and that previous object gets canceled  
	
	System.out.println(s1==s2); // == comparision operator is used to check the reference/pointer/address
	// the address of the object s1 and s2 are same hence it is true and it does not check the information
	
	System.out.println(s1.equals(s2));  // true as it checks only the information and is case sensitive
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}

package String_class;

public class String_class02 
{
	
	
	public static void main(String[] args) 
	{
		// the object creation takes place inside the non-constant pool area
		// String object declaring using the new keyword
		
		
		String s1 = new String("ABC");     
		
		String s2 = new String("ABC");     // duplicate object gets created inside the non constant pool area
		
		// to check the address of s1 and s2 we use comparison operator ==
		
		System.out.println(s1==s2);
		
		// the object reference is not the same hence the boolean o/p is false 
		// as the duplicate objects are allowed inside the constant pool area 
		
		System.out.println(s1.equals(s2)); // as the object data/value are same hence its true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}

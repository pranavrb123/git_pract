package oops_practice;

public class boolean_casting 
{
	
	public static void main(String[] args)
	{
		// boolean type of casting is said as incompatible type of casting as the boolean data type is 
		// unique type of data where the value is already pre-declared inside it 
		
		
		String str = "Pranav";
		
		String str1 = "true";
		
		Boolean B1 = Boolean.valueOf(str);  // valueOf method of Boolean and returns Boolean
		
		Boolean B2 = Boolean.valueOf(str1);

		System.out.println(B1);
		
		System.out.println(B2);
	
		int a = 15;
		
//		The method valueOf(boolean) in the type Boolean is not applicable for the arguments (int)
	 	//Boolean B3 = Boolean.valueOf(a); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

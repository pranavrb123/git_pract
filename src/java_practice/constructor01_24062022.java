package java_practice;

public class constructor01_24062022 
{  // default constructor 

	
	// First declare the variable 
	
	int a=10;
	int b=10;
	
	// initialize the global variable in non static regular method
	
	public void addition() 
	{
	     int sum =a+b;
	     System.out.println(sum);
		
	}
	
	public static void main(String[] args)
	{
		
		// use of the default constructor to call the method 
		
		constructor01_24062022 e1 = new constructor01_24062022();
		e1.addition();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

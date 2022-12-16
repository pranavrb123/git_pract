package java_practice;

public class constructor0_24062022
{
	
	
	// declare the non static global variable 
	
	int a;
	int b;
	
	// Initialize the variable inside the constructor 
	
	constructor0_24062022()  // user defined constructor
	{
		a=50;
		b=50;
		
	}
	
	// utilize within the method 
	
	public void multiplication()
	{
		int product;
		product=a*b;
		System.out.println(product);
		
	}
	
	// call the methods inside the main method
	
	public static void main(String[] args) 
	{
		
		
		constructor0_24062022 e2 = new constructor0_24062022();
		e2.multiplication();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

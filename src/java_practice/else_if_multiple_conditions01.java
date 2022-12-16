package java_practice;

public class else_if_multiple_conditions01 
{

	public static void main(String[] args) 
	{
		  // reverse order is not possible
		int b=50; // because if the given statement matches the first if condition then the first statement is executed
		             // it will not enter the further statements 
		
		
		if(b>=35)
		{
			System.out.println("Pass");
		}
		else if(b>=50)
		{
			System.out.println("Second class");
		}
		else if(b>=55)
		{
			System.out.println("Higher second class");
		}
		else if(b>=60)
		{
			System.out.println("First class");
		}
		else if(b>=65)
		{
			System.out.println("Distinction");
		}
		
		else if(b<35)
		{
			System.out.println("fail");
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


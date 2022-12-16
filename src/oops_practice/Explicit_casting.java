package oops_practice;

public class Explicit_casting
{
	
	// converting higher data type to lower data type info is called as explicit casting 
	// It is also known as Narrowing casting as the memory type goes on decreasing 
	
	public static void main(String[] args) {
		
	
	float f= 100.0f;
	
     System.out.println(f);
	
	// need to convert to int data type information 
     
     System.out.println("---------------------------------------------------------------------");
     
	int g = (int)f;
	System.out.println(g);
	
	
	
	
	double d = 111.5;
	System.out.println(d);
	
	int w = (int)d;
	
	System.out.println(w);  // 111 decimal is neglected 
	
	
	
	
	
	
	
	}
	
	
	

}

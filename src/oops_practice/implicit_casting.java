package oops_practice;

public class implicit_casting 
{

	// converting Lower data type into Higher data type is called implicit casting 
	// it is also called as Widening casting as the memory size goes on increasing
	
	
	public static void main(String[] args)
	{
		
		
		int a = 10;
		
		System.out.println(a);  // int 
		
		// converting to lower data type
		
	   float b = a;
		
		
		System.out.println(b);  // converting to higher data type 
		
		
		
		
		byte c=15;
		
		System.out.println(c);
		
		// converting to int data type 
		
		int d = c;
		
		System.out.println(d);
		
		
		int e = 56;
		
		System.out.println(e);
		
	//	String e1 = e; type mismatch as we cannot convert from primitive data type to non primitive data type
		
		int r = 100;
		
		System.out.println(r);    // 100
		
		double r1 = r;
		
		System.out.println(r1);   //  100.1
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package java_practice;

public class To_call_regular_method_from_diff_class 
{

	// this keyword
	
	int a = 555;
	int b = 888;
	
	static int c = 444;
	
	public static void main(String[] args)
	{
		// create the object of class
		
		To_call_regular_method_from_diff_class pra = new To_call_regular_method_from_diff_class();
		
		pra.p1(); //object name.method name();
		
		p2();  // static regular  method
	
		System.out.println("-----------------------");
		System.out.println(c);
        System.out.println("-----------------------");
        
        System.out.println(pra.a);  // object name.variable name  
	}
	
	
	public void p1() 
	{
		int a = 1000;  // here the local variable name is a and thus the compiler will only consider it.
		System.out.println(a);
		
		
		// but the global variable is also of same name a so to call that variable we need to use this keyword
		 
		System.out.println(this.a);
		
		System.out.println(this.b);
		
	 // 	static int c=111; not possible as only final is possible as a modifier
			
	}
	
	public static void p2()
	{
		int b= 999;
		System.out.println(b);
		 
		// System.out.println(this.b); we can't use inside the static regular method to call non static global
		// - variable  
		
	   //  static int c = 787; not possible as only final is possible as a modifier
		
		
		
	}
	
	
	
	
}

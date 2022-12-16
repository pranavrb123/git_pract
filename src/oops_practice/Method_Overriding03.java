package oops_practice;

public class Method_Overriding03 extends Method_overriding01
{  // To perform method overloading and Method Overriding
	
	// just create the object of that class 
	
	public static void main(String[] args) 
	{   // calls all the methods from super/father class only 
		
		Method_overriding01 prv = new Method_Overriding03();
		//prv.Moo();   // calls the method from super class only 
		prv.Moo1();  // it calls the over rided method in this class only and not the method inside the super class
		
		prv.Moo1('V');
		
		
		//--------------------------------------------------------------------------------------------------------------
		System.out.println("-------------------------------------------------------------------");
		
		// creating the method of same class
		
		Method_Overriding03 prv1 = new Method_Overriding03();
		prv1.Moo1();  // same class method which is override non static
		prv1.Moo1('B');   // method of father class non static
		prv1.Moo();  // method of the same class static
		prv1.Moo(14);  // method of father class static method 
		
		
		
	}	
	
	

	public static void Moo()   // static method overriding not possible
	{
		System.out.println("How r u Bhaskare");
	}
	
	
	public static void Moo(int a)    // method overloaded  Moo 
	{
		System.out.println(a);
	}
	
	
	
	
	//  2 nd Non static method
	
	public void Moo1()                      // Non static method is Override here 
	{
		System.out.println("Hi pranav how r u ");
	}
	
	
	public void Moo1(char sgrade)     // Method overloaded Moo1
	{
		System.out.println("Hello");
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	

}

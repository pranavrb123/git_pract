package oops_practice;

public class Method_overriding02  extends Method_overriding01
{
   // 1st Static methods 
	
	public static void Moo()      // this is not method overloading it is method hiding concept for static method
	{
		System.out.println("How r u Bhaskare");
	}
	
	
	public static void Moo(int a)    // this is not method overloading it is method hiding concept for static method
	{
		System.out.println(a);
	}
	
//---------------------------------------------------------------------------------------------------------------------	
	 
	// 2nd Non Static methods
	
	public void Moo1()                           // green triangle shows that the Non static method is overridden
	{
		System.out.println("Hi My name is Pranav ");   // changing the definition 
	}
	
	
	public void Moo1(char sgrade)               // green triangle shows that the Non static method is overridden
	{
		System.out.println("I am Fine Thank you");    // changing the definition 
	}
	
	
	
	
//--------------------------------------------------------------------------------------------------------------
	
	// Declaring the method of same class 
	
	
	public static void Moo2()
	{
		System.out.println("Hello");
	}
	
	public static void Moo2(int f)
	{
		System.out.println("Hi every one");   // the method overloaded Moo2
	}
	
	// Non static method also 
	
	public void Moo3()
	{
		System.out.println("heheehe");
	}
	
	public void Moo3(char sgrade)
	{
		System.out.println("ahahahah");        // the method overloaded Moo2
	}
	
	
	
	
	
}


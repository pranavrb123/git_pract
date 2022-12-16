package oops_practice;

public class Method_Overloading 
{
	
	// method overloading is the example of compile time polymorphism 
	// same method name but different ARGUMENT in SAME CLASS
	
	// 1st the static method 
	 
	public static void Mo()                    // method declaration
	{
	   System.out.println("Hi Pranav");             // method Definition
	}
	
	// Method overloaded 
	
	public static void Mo(int a)
	{    a= 20;
		System.out.println(a);
	}
	
	// ---------------------------------------------------------------------------------------
	
	// now the non static method
	
	public void Mo1()                                    // method declaration
	{
		System.out.println("Pranav");                     // method definition
	}
	
	// Method overloading 
	
	public void Mo1(String sname)
	{
		sname="Bhaskare";
		System.out.println(sname);
	}
	
	
       strictfp synchronized static public void main(String pranav [])    // main method overloading 
	{
		
		Mo();        // Hi Pranav
		Mo(55);      // 20
    	   
    	   
    	// to call the Non static method  
		System.out.println("-----------------------------------------------------------------");
		
		
		Method_Overloading Mo3 = new Method_Overloading();
		Mo3.Mo1();
    	Mo3.Mo1("");
    	   
    	   
    	   
		
		
	}
	
	
	
	
	
	
	
	
	

}

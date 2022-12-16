package java_practice;

public class Method_call_230622022 
{
	
	
	public static void main(String[] args) 
	{   // To call the methods Static as well as Non Static
		
		
		Method_call_230622022 S5 = new Method_call_230622022();
		S5.m1();   // it is possible to access object name.method name but not a good practice
		
		// we can't call the non static method directly we need to call by object name.method name 
		 // m2();    // cannot make a static reference to a non static method
		
		
		S5.m2();  // this is the right way to call the Non Static methods
		
//-------------------------------------------------------------------------------------------------------------------		
		
		// To call the methods from different class 
		
		// 1st create the object of different class 
		
		Method_call01_230622022 S2 = new Method_call01_230622022();
		
		// call non static method 1st 
		
		S2.m4();  // object name. method name
		
		// similarly we call the static method
		
		S2.m3();  // compiler says- The static method m3() from the type Method_call01_230622022 should be accessed in a static way
		
		// so we call the static method m3 from different class in static way
		
		Method_call01_230622022.m3(); // class name.method name 
		
	}
	
	
	
	
	public static void m1() 
	{
		System.out.println("Hello Pranav");
	}
	
	
	
	public void m2()
	{
	   System.out.println("Good Afternoon");
	}
	
	
	
	
	
	
	
	
	
	

}

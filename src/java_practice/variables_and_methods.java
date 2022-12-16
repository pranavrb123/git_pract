package java_practice;

public class variables_and_methods
{

	 public static void main(String[] args)
	 {
		// main method body 
		 
		 
		 m1();  // method name(); // static regular method call from same class
		 
		 
		 m1(95,"Pranav",'A',95f);   // method name (values) // static regular method with parameter. 
		 
		 // Non static regular method without parameter and call from same method
		 
		 // 1st create object of the same class
		 
		 
		 variables_and_methods var = new variables_and_methods();
		 
		 var.m2();  // object name.method name();
		 
		 // call Non static regular method m3
		 
		 var.m3(140, 75,"how are u pranav", 'A', 96.45f);
		 
		 
		 
		 
		 
	}
	
	
	//  static regular method without parameter and local variable declaration and initialization 
	 
	 public static void   m1()
	 {
		 int a= 62;             // local variable 
		 System.out.println(a);  // printing statement
	 }
	
	// static regular method with parameter and method overloading
	
	public static void m1(int a, String sname, char sgrade , float percent)
	{
	
		System.out.println(a);            // syso(variable name)
		System.out.println(sname);        // syso(variable name)
		System.out.println(sgrade);       // syso(variable name)
		System.out.println(percent);      // syso(variable name)
		
		System.out.println("---------------------------------------------");
		
	}
	
	
        
	

	
	
	// Non static regular method without parameter
	
	public void  m2()
	{
	   // declaring and initializing all data types 
		
	// Primitive :-
		
	 byte a= 10; 
	 short b= 12;
	 int c=14;
	 long d=16;
	 float e=17f;
	 double f=18d;
	 
	 char g='A';
	 
	 boolean h=true;
	 
	 
	 
	 //  Non Primitive:-
	 
	 String i= "pra@#$%123_456";
	 
	// variable usage
	 
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(c);
	 System.out.println(d);
	 System.out.println(e);
	 System.out.println(f);
	 System.out.println(g);
	 System.out.println(h);
	 System.out.println(i);
		
		System.out.println("------------------------------------------------");
	}
	
	
	// Non Static regular method with parameters 
	
	public void m3(int as, int ad, String pname, char sgr, float perc )
	{
		 as =50;  // with changing the variable value
		
		System.out.println(ad);
		System.out.println(pname);
        System.out.println(sgr);		
        System.out.println(perc);  
        
	}
	
	
	
	
	
	
	
	
}

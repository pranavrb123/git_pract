package Types_of_variables;

public class constructor_01 
{
   int a;
   int b= 200;   // global variable to be print in console by using this keyword
	
   
   
	constructor_01()
	{
		a=10;
		System.out.println(a+"=construct without para");
	}
	
	
	
	
	constructor_01(String sname)
	{  
		this();  // to call the constructor without parameter 
		sname="Pranav";
		System.out.println(sname+"=constructor with String para");  // prints Pranav
		
	}
	
	
	
	
	
	constructor_01(int b)  // constructor without/zero parameter will also come inside this parameter as it is present inside String sname constructor
	{   
		// to call the string arg constructor inside this constructor
		this("Hi");  // String sname initialized inside "this(parameter)"
//-------------------------------------------------------------------------------------------		
		
		System.out.println(this.b + "=Global variable b"); // 200 // if i call the varible by using this.a = keyword.variable name it will
	                                // print b= 200 and not 2000 which is passed inside the constructor arg.
		
		System.out.println(b+"=local variable"); //2000 // to print int b local variable i,e 2000
	}
	
	
	
	
	
	
	
	
	
//------------------------------------------------------Main method Started-----------------------------------------	
	public static void main(String[] args) 
	{
		
		constructor_01 c1 = new constructor_01();
		
		
System.out.println("-------------------------------------------------------");	
		
		constructor_01 c2 = new constructor_01("");
		
System.out.println("-------------------------------------------------------");	

		
		constructor_01 c3 = new constructor_01(14000);  // this will print the values of the local variables a
		
		// but we want the global variable to print so we use this keyword 
		
		
//---------------------------------------------------- Main method ended------------------------------------		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

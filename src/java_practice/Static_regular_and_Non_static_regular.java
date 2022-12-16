package java_practice;

public class Static_regular_and_Non_static_regular
{
	
	
	int a = 100;  // Non static global variable
	static int b= 150; // Static variable or class variable  // static is case sensitive keyword
	
	
	 public static void main(String[] args) 
	 {
		 
		 m4();
		 
		 Static_regular_and_Non_static_regular var1 = new Static_regular_and_Non_static_regular();
		 
		var1.m5();  // object name.method name 
		 
		 // call the non static global variable from same class
	   System.out.println(var1.a); // always object name.variable name
	   
	   System.out.println(b); // as b variable is static variable hence it is called directly in syso
//--------------------------------------------------------------------------------------------------------------		 
		
	   // local variable and global variable have same variable name a so we will use "this" key word to
	   // call the global variable  
	   
	  
		 
		
	}
	 
	
	// static regular method 
	 
	 public static void m4() 
	 {
		 
		//  System.out.println(a); not possible
		 System.out.println(b); // static variable can be called inside the static method 
		 // but we can't call non static global variable inside the static method.
	 }
	
	
	 public void m5()
	 {
		 System.out.println(a);  //  Non static or instance variable can be called inside the non static method
		 
		 System.out.println(b);  // u can call static variable inside the non static method also
	 }
	
	
	
	
	
	
	
	
	

}

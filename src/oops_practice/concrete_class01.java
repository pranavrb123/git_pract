package oops_practice;

public class concrete_class01 extends abstract_class
{

	// method definition is given here 
     public void Ab3()                         // implements oops_practice.abstract_class.Ab4
     {
    	 System.out.println("Hi i am from abstract class");
     }
	
	 public void Ab4()                          // implements oops_practice.abstract_class.Ab4
	 {
		 System.out.println("Hi i am also from abstract class");
	 }
	
	
	public static void main(String[] args) 
	{
		
		
		concrete_class01 CC = new concrete_class01();
		CC.Ab1();   // static mehthod
		CC.Ab2();
		CC.Ab3();
		CC.Ab4();
		
		Ab1();  // static method accessed in static way 
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

package oops_practice;

public class SingleLevel_Inheritance02 extends SingleLevel_Inheritance01
{

	public static void sonclass01()
	{
		System.out.println("I am from son class");
	}
	
	
	

	public void sonclass02()
	{
		System.out.println("I am from son class 2");
	}
	
	
	public static void main(String[] args) 
	{
	
	SingleLevel_Inheritance02 class1 = new SingleLevel_Inheritance02();
			class1.fatherclass01();  // static method 
	        class1.Fatherclass02();
	
	 System.out.println("--------------------------------------------------------------------------------------");       
	// call the methods inside the son class 
	        
     SingleLevel_Inheritance02 class2 = new SingleLevel_Inheritance02();
	        
	        class2.sonclass01();  // static method 
	        class2.sonclass02();
	        System.out.println("-------------------------------------------------------------------------------");
	        
	        // creating the object of the son class with the reference of the father class
	        
	        SingleLevel_Inheritance01  class3 = new SingleLevel_Inheritance02();
	        class3.fatherclass01();  // u can call the methods of the father class but not the methods of the son class
	        class3.Fatherclass02();
	// or u can say returning the methods taken from the father to father back non primitive up casting 
	}
	
	
	
	
}

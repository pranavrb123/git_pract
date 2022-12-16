package oops_practice; // Multiple Inheritance by using interface and implements keyword

public class Multiple_inheritance_implementation implements Multiple_Inheritance, Multiple_Inheritance01
{

	public static void main(String[] args) 
	{
		Multiple_inheritance_implementation MIH = new Multiple_inheritance_implementation();
		MIH.M1();
		MIH.M2();
		MIH.M3();
		MIH.M4();
		
		
	}	
		
		
		
	// to perform multiple inheritance we use Interface
	
         public  void M1()  
         {
	          System.out.println("Hi 02");
         }
	
          
          public  void M2()
	      {
        	  System.out.println("Hi 04");
	      }
	
         public void M3()    
         {
        	 System.out.println("Hi 06");
         }
      	
       	 public void M4()    
       	 {
       		System.out.println("Hi 08");
       	 }
       	 
	
	
	
	
	
	
	
	
	
	
}

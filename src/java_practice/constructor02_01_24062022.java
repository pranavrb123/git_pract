package java_practice;

public class constructor02_01_24062022 
{
	
	public static void main(String[] args) 
	{
	
	// create the object of the different class and call the methods
	
		constructor02_24062022 r1 = new constructor02_24062022();  // for user defined constructor without parameter
			r1.addition();
			r1.multiplication();
			r1.Studentsname();
		
		// creating the object of the different class to call the method again 
System.out.println("--------------------------------------------------------------------------------------------------------");	
			
		constructor02_24062022 r2 = new constructor02_24062022(10,10,"Ritesh deshmukh");
		r2.addition();
		r2.multiplication();
		r2.Studentsname(); // will not print as the value/data type for Studentname is String type and is not declared there 
		                   // inside the constructor02_24062022 class constructor with parameter
		
System.out.println("--------------------------------------------------------------------------------------------------------");		
		
		// we call the method Students name 

        constructor02_24062022 r3 = new constructor02_24062022("Hi how r u");
		r3.Studentsname();
		
System.out.println("--------------------------------------------------------------------------------------------------------");		
		
        constructor02_24062022 r4 = new constructor02_24062022(25,25,"Hi Pranav");
        r4.addition();
		r4.multiplication();
		r4.Studentsname();
		
		
	
	
	
	
	
	
	
	
	}
	
	
	
	
	

}
 
package java_practice;

public class constructor_multiple_datatype 
{
	
	// Declare multiple data types 
	
	int a;
	String Studentname;
	char b;
	float studentpercentage;
	
	// Initialize the variables inside the constructor without parameter
	
	constructor_multiple_datatype()
	{
		a=75;
		Studentname="Bhaskare";
		b='Y';
		studentpercentage= 88.5f;
	}
	
	// Initialize the variables again with new values inside the parameter of the constructor
	
	constructor_multiple_datatype(int w,String sname,char j, float percent)
	{
		a=w;                                        // variable1 = variable2
		Studentname=sname;
		b=j;
		studentpercentage=percent;
	}
	
	// usage/utilize firstly declared variables
	
	public void StudentsInfo1() 
	{
		System.out.println(a);
		System.out.println(Studentname);
		System.out.println(b);
		System.out.println(studentpercentage);
		
	}
	
// to call the methods to run inside the main method 	
	
	
	public static void main(String[] args) 
	{
		// creating the object of same class for the constructor without/zero parameter 
		
		constructor_multiple_datatype yes = new constructor_multiple_datatype();
		yes.StudentsInfo1();

	
System.out.println("----------------------------------------------------------------------------------------------------------");		
		
	   // creating the object of same class for the constructor with parameter
		
		constructor_multiple_datatype yes1 = new constructor_multiple_datatype(60,"Rahul",'Q',90.5f);
		
		yes1.StudentsInfo1();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

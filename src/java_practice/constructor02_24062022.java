package java_practice;

public class constructor02_24062022
{

	 // decalre the variables 
	
	int Num1;
	int Num2;
	String Studentname;
	
	// initialize the variables
	
	// 1st constructor without parameter which is used once in the class
	
	
	constructor02_24062022()
	{
		Num1=5;
		Num2=5;
		Studentname="Pranav";
	}
	
	// we again initialize the same variable declared globally 
	
	// 2nd by using the parameter constructor
	
	constructor02_24062022(int a ,int b , String sname ) // variable 2
	{
		Num1=a;   // variable 1 = variable 2
		Num2=b;   // variable 1 = varibale 2
		Studentname=sname;
	}
	
	// now to again initialize the String variable 
	
	constructor02_24062022(String sname)  // String varaible 2
	{
		Studentname=sname;  // String variable1 = String variable2
	}
	
	
	// usage of the variables using non static methods
	
	public void addition()
	{
		int sum = Num1+Num2;
		System.out.println(sum);
		
	}
	
	// multiplication 
	
	public void multiplication()
	{
		int multiply = Num1*Num2;
		System.out.println(multiply);
	}
	
	// student name 
	
	public void Studentsname()
	{
		System.out.println(Studentname);
	}
	
	
	
	
	
}

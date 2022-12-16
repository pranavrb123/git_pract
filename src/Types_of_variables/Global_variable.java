package Types_of_variables;

public class Global_variable 
{
	static String sname ="Pranav";  // class variable or static variable
	char sgrade = 'A';
	
	
	public static void main(String[] args)
	{// to access the Static variable call from same class
		
		System.out.println(sname); // inside the printing statement 
		
		
		// to call the variable from different class- ClassName.varaible name
		
		System.out.println(Global_variable_diff_class.DiffClass);
//-----------------------------------------------------------------------------------------------------------
		// class name.variable name
		System.out.println(Global_variable_diff_class.DiffClass);
	
		
		// create the object of the same class to call the static variable from same class
		
		Global_variable class1 = new Global_variable();
		System.out.println(class1.sname);   // object name.variable name
		
//----------------------------------------------------------------------------------------------------------------		
		// to call the variable of different class 
		// 1st create the object of different  class
		
		Global_variable_diff_class class2 = new Global_variable_diff_class();
		
		System.out.println(class2.DiffClass);
		
//----------------------------------------------------------------------------------------------------------------		
	
		// To print the Non  static variable from same class
		Global_variable class3 = new Global_variable();
		
		System.out.println(class3.sgrade);  // objetc name.variable name
		
//-------------------------------------------------------------------------------------------------------------		
		
	// to call the non-static or instance variable call from different class
		
		Global_variable_diff_class class4 = new Global_variable_diff_class();
		System.out.println(class4.spercent);
		
System.out.println("----------------------------------------------------------------------------------");		
		
		// to access the global variables inside the Static and non static methods of the same class

// 1st static method


		
		
	}
	
	public static void h1()
	{
		// to call the static variable from same class 
		
		System.out.println(sname);
		// create the object of the same class
		
		Global_variable h12 = new Global_variable();
		System.out.println(h12.sname);  // object name.variable name
		
		// to call the static variable from the different class 
		
	       System.out.println(Global_variable_diff_class.DiffClass);
	       
	       // 2nd create the object of the different class 
	       
	       Global_variable_diff_class hu = new Global_variable_diff_class();
	       System.out.println(hu.DiffClass);
		
	}

	public void h2()
	{
		
		System.out.println(sname); // direct call 
		
		
		// 2nd create the  object of the same class
		
		Global_variable hj = new Global_variable();
		System.out.println(hj.sname);
		
		
		
		
		
	}
	
	public static void p1()
	{
		System.out.println(Global_variable_diff_class.DiffClass);
		// create the object of the diff class 
		
		Global_variable_diff_class t1 = new Global_variable_diff_class();
		System.out.println(t1.DiffClass);
		
		
	}
	
	public void p2()
	{
		System.out.println(Global_variable_diff_class.DiffClass);
		// 2nd create the object of diff class
		
		Global_variable_diff_class tr = new Global_variable_diff_class();
		System.out.println(tr.DiffClass);
		
		
	}
	
	public static void p3()
	{
		//System.out.println(sgrade); cannot make static reference to the non static field 
		
		// creat the object of the same class
		
		Global_variable ty = new Global_variable();
				
		System.out.println(ty.sgrade);
	}
	
	public void p4()
	{
		System.out.println(sgrade);
	}
	
	
	

}

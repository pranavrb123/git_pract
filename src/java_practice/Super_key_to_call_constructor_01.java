package java_practice;

//  extends to perform inheritance is important
public class Super_key_to_call_constructor_01 extends Super_key_to_call_constructor
{

	Super_key_to_call_constructor_01()
	{
		super(); // calls the non parametric constructor from parent class
			
	}
	
	
	Super_key_to_call_constructor_01(int a)
	{
		super("pranav Bhaskare"); // calls the parametric constructor from parent class
	}
	
	
	
	Super_key_to_call_constructor_01(int b , int c)
	{
		this(); // calls the non parametric constructor of the same class
		
	}
	
	public static void main(String[] args) 
	
	{
		Super_key_to_call_constructor_01 s3 = new Super_key_to_call_constructor_01();
		
	
		
		
		
		
	}
	
	
	
	
	
	
}

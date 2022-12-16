package java_practice;

public class reverse_string1 
{

	public static void main(String[] args) 
	{
		
		
		System.out.println(reverse_string1.ReverseString("pranav bhaskare"));
		
		System.out.println(reverse_string1.Rev1("uoy r woh vanarp"));

		
	}
		
	
	
	
	
	
	public static String ReverseString(String s1)
	
	{
		       
		
		StringBuilder sb = new StringBuilder(s1);
		
		sb.reverse();
		
		return sb.toString();
		
		
		
	}
	
	
	
	
	
	public static String Rev1(String s2)
	{
		
		StringBuffer sb1 = new StringBuffer(s2);
		
		sb1.reverse();
		
		return sb1.toString();
				
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

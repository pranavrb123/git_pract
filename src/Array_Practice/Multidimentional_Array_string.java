package Array_Practice;

public class Multidimentional_Array_string 
{

	
	public static void main(String[] args)
	{
		
		String[][] str =  {{"how","Are","You"},{"I","Am","Fine"}};
		
		for( String[] str1:str)  // as it is array type string need to mention string[] with symbol or it gives compile time error
		
		{ 
			for(String str2:str1) // for inner array 
			{
			   System.out.print(str2+ " ");
			}
			
			System.out.println();
		}
		
		
//		for(int i=0; i<=1 ; i++)
//		{
//			for(int a=0; a<=2; a++)
//			{
//				System.out.print(str[i][a] + " ");
//			}
//			System.out.println();
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

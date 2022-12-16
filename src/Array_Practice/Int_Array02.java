package Array_Practice;

import java.util.Arrays;

public class Int_Array02 
{
	
	public static void main(String[] args) 
	{
		
		int[] ar = new int[3];
		
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		
		
		int[] ar1 = new int[3];
		
		ar1[0] = 10;
		ar1[1] = 20;
		ar1[2] = 30;
		
		
		
		for(int i=0; i<=ar.length-1 ; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("=====================");
		
		for(int a=0; a<=ar.length-1 ; a++)
		{
			System.out.println(ar[a]);
		}
		
		System.out.println("=======================================================");
		
//		 to check the 2 arrays together using the arrays method
	Boolean result	= Arrays.equals(ar,ar1);
		
		System.out.println(result);
		
//	     to check the array is empty or not 
		
		
	   System.out.println(ar.length);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

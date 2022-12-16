package Array_Practice;

import java.util.Arrays;

public class Int_Array01 
{

	public static void main(String[] args)
	{
		
		// declare the array first
		
		int[] ar = new int[5];
		
		// size of array = 5-1 = 4
		
		// initialization of array 
		
		ar[0] = 100;
		ar[1] = 500;
		ar[2] = 400;
		ar[3] = 200;
		ar[4] = 300;
		
		int[] ar1 = new int[5];
				
        ar1[0] = 100;
        ar1[1] = 500;
		ar1[2] = 400;
		ar1[3] = 200;
		ar1[4] = 300;
		
		
		// to print in the ascending order 
		
		Arrays.sort(ar);   // Arrays is the inbuilt class and the sort method is static method to sort 
		                   // the arrays in ascending order by default
		
		
		for(int i =0 ; i<=ar.length-1 ; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("-----------------------------------------------------------------------");
		
		Arrays.sort(ar);
		
		// to print in descending order
		
		for(int i =ar.length-1 ; i>= 0; i--)
		{
			System.out.println(ar[i]);
		}
//----------------------------------------------------------------------------------------------------------		
		System.out.println("-----------------------------------------------------------------------------");
		
		Arrays.sort(ar1);
		
		for(int a=ar1.length-1 ; a>=0 ; a--)
		{
			System.out.println(ar1[a]);
		}
		
		
		System.out.println(ar.equals(ar1));
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

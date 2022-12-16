package Array_Practice;

public class intiger_array 
{

	public static void main(String[] args)
	{
		// Array is a data structure which is used to store the collection of information
		// Homogeneous in nature i;e its data type is fix 
		// array declaration must be done with capacity 
		// Not growable in nature its size is fix hence to declare with the capacity
		// the array is an object 
		// inside object array index will be present 
		// Array index starts from zero
		// types of arrays 
		// Single dimensions and Multidimention array
		
		// 1st int array declaration
		
		int[] ar = new int[5];//  int[size of array]
		
		
		// to find the index of the array object = size-1/length-1  == 5-1=4 
		
		// array initialization
		
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
		
//		ar[5]=60;   Index 5 out of bounds for length 5
		
		// array printing 
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		
//		System.out.println(ar[5]);
	System.out.println("----------------------------------------------------------------------------------");	
		
	// another method to print is using the for loop 
		
	
	
	//          i=0  0<=4
	//          i=1  1<=4
//              i=2  2<=4
//              i=3  3<=4
//              i=4  4<=4
//              i=5  5<=4          will not enter the loop
		for(int i=0 ;i<=ar.length-1 ; i++)
		{                 //      0
			              //      1
			              //      2
			              //      3
			              //      4
			System.out.println(ar[i]);  // ar[index]
		}
	
		System.out.println("---------------------------------------------------------------------------");
		
		
		// while loop 
		int a= 0;
		while(a<=ar.length-1)
		{
			System.out.println(ar[a]);
			a++;
		}
		
		// do while loop to print the statement
		
		System.out.println("---------------------------------------------------------------------------");
			
		int b=0;
		do
	    {
			System.out.println(ar[b]);
			b++;
	    }
		while(b<=ar.length-1);
		
		System.out.println("-------------------------------For Each--------------------------------------");
		
		// for each
		for( int ar1:ar)
		{
			System.out.println(ar1);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

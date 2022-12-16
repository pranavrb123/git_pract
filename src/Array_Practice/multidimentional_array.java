package Array_Practice;

public class multidimentional_array 
{

//                        	0     1     2
//	                  0    10     20    30 
//	                  1    40     50    60   
	
	public static void main(String[] args) 
	{

	//              int[row][clm]
	int[][] ar = new int[2][3];
	
	// initalize the array
	
	ar[0][0]=10;
	ar[0][1]=20;
	ar[0][2]=30;
	ar[1][0]=40;
	ar[1][1]=50;
	ar[1][2]=60;
	
	
	// usage 
	
	
	//      i=0  0<=1    1
//	             1<=1    2
//	             2<=1           not possible it  will not enter for loop any 
	for(int i=0; i<=1 ;  i++)
	{
		
//              a=0  0<=2	1
//		             1<=2   2
//		             2<=2   3
//		             3<=2        not possible it will exit the inner loop and will enter the outer loop 
		
//		        a=0  0<=2   1
//		             1<=2   2
//		             2<=2   3
//		             3<=2        not possible it will exit the inner loop and will enter the outer loop 
		for(int a=0 ;a<=2 ; a++)
		{
			//                    0  0 ==       10
//			                      0  1 ==       20
//			                      0  2 ==       30
			
//			                      1  0 ==       40
//			                      1  1 ==       50
//			                      1  2 ==       60
			System.out.println(ar[i][a]);
		}
	}
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}

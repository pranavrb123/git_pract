package Array_Practice;

public class array_int
{

	public static void main(String[] args) 
	{
		
		int[] ar = new int[3];
		
		ar[0]= 10;
		ar[1]= 20;
//		ar[2]= 30;   // prints 0 for int type array
		
	
		
		for(int i=0 ;i<=ar.length-1 ; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("--------------------------------------------------------------------");
		
		
		String[] sr = new String[3];
		
		sr[0] = "Pranav";
		sr[1] = "Bhaskare";
//		sr[2] = "Hi how r u";   // will print null as o/p in console
 		

		for(int a=0 ;a<=ar.length-1 ; a++)
		{
			System.out.println(sr[a]);
		}
		
		
		System.out.println("--------------------------------------------------------------------");

		char[] ch = new char[3];
		ch[0] ='A';
		ch[1] ='B';
//		ch[2] ='C';     // blank values 
		
		for(int b=0 ;b<=ch.length-1 ; b++)
		{
			System.out.println(ch[b]);
		}
		
		System.out.println("--------------------------------------------------------------------");

		float[] fl = new float[3];
		
		fl[0]=10.5f;
		fl[1]=20.5f;
//		fl[2]=30.5f;    // 0.0   default value of float 
		

		for(int c=0 ;c<=ch.length-1 ; c++)
		{
			System.out.println(fl[c]);
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

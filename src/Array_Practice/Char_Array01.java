package Array_Practice;

import java.util.Arrays;

public class Char_Array01
{
	public static void main(String[] args) 
	{
		
		char[] ch = new char[3];
		
		ch[0]='B';
		ch[1]='A';
		ch[2]='C';
		
		
		Arrays.sort(ch);
		
		// usage desc order 
		
		for(int i=ch.length-1 ; i>=0 ; i--)
		{
			System.out.println(ch[i]);
		}
		
		
		System.out.println("--------------------------------------------------------------------");
		
	for(int a =0; a<=ch.length-1 ; a++)
	{
		System.out.println(ch[a]);
	}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package java_practice;

public class Useofsuperkeyword1 extends UseofSuperkeyword

{

	
	// creating an Non static regular method and creating and variable by pr which is same as variable name
	// from UseofSuperKeyword
	

	public void h1()
	{
		int pr = 2222;
		System.out.println(pr);
		System.out.println(pr);
		System.out.println(super.pr); // 785  // super.pr 
	}

	public static void main(String[] args)
	{
		Useofsuperkeyword1 b1 = new Useofsuperkeyword1();
		b1.h1();
		
	}
	
	
	
	
}

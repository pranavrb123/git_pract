
public class Methods 
{

	char sgrade = 'y';
	
	// to access the Static variable inside the static method
	
		public static void m1()
		{
			System.out.println("Hi");
			
			// to call the Non static method from same class
		//	m2(); // Cannot make a static reference to the non-static method m2() from the type Methods
			
			Methods cr5= new Methods();
			cr5.m2();
			
		}
		
		public void m2()
		{
			// to call static method inside the non static method
			m1(); // direct method name 
			// 2nd create the object of same class 
			
			Methods cr1 = new Methods();
			cr1.m1();  // object name.method name 
			
			System.out.println("Hi hello");
			System.out.println("Changes Made By Me");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

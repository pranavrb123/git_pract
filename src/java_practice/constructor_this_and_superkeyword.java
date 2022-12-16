package java_practice;

public class constructor_this_and_superkeyword
{
	
	
	// variable declaration 
	
	String Studentname;
	int StudentrollNo;
	char Studentgrade;
	float Studentpercent;
	
	
	
	// variable initialization by using constructor

	constructor_this_and_superkeyword()
	{
		Studentname= "Pranav";
		StudentrollNo= 14;
		Studentgrade= 'A';
		Studentpercent= 99.9f;
		
	}
	
	constructor_this_and_superkeyword(int a)
	{   this.Studentname="Bhaskare";
	    this.StudentrollNo=78;
		this.Studentgrade='D';
		this.Studentpercent=95.5f;
		
	}
	
	
	
	
    public void m1()
    {
    	System.out.println(Studentname);
    	System.out.println(StudentrollNo);
    	System.out.println(Studentgrade);
    	System.out.println(Studentpercent);
    	
    }
	
    
	
    public static void main(String[] args)
    {
    	
    	constructor_this_and_superkeyword cs = new constructor_this_and_superkeyword();
    	cs.m1();
    	
    	constructor_this_and_superkeyword cs2 = new constructor_this_and_superkeyword(100);
    	cs2.m1();
    	
    	
    	
    }
    
	
	
	
	

}

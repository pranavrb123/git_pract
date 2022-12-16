package String_class;

public class String_Methods 
{
	
	public static void main(String[] args) {
		
	
	
	
	String s1 = "String";
	
  System.out.println(s1.toUpperCase());   // string return type 
	
	String s2 = "PRAnav";
	
	System.out.println(s2.toLowerCase());  // string return type 
	
	
	String s3 = "STring";
	
	System.out.println(s1.equals(s3)); // case sensitive  boolean return
	 
	
	// to ignore the case sensitiveness 
	
	System.out.println(s1.equalsIgnoreCase(s3));   // true  boolean
	
	// to check the contains of the 2 strings
	
	System.out.println(s1.contains("ing"));  // true 
	
	System.out.println(s1.contains("ING"));  // false  case sensitive returns boolean 
	
	
	// to find the character present at the specific index 
	
//  S  t  r  i  n  g  characters inside the s1 object 
//	0  1  2  3  4  5  index value 
	
	System.out.println(s1.charAt(2));  // r in console 
	System.out.println(s1.charAt(0));  // S
	System.out.println(s1.charAt(4));  // n   string return type 
 	
	// startsWith method to check the character starting with which char 
	
	System.out.println(s1.startsWith("S"));  // as it is String value mention it inside the " " only
	
	System.out.println(s1.startsWith("s"));  // false as it is in lower case the method starts
	
	// to check whether the string character ends with 
	
	System.out.println(s1.endsWith("ng"));  // returns true 
	
	System.out.println(s1.endsWith("NG"));  // as it is case sensitive 
	
	// to find the index value at the given car value 
	
	System.out.println(s1.indexOf("S")); // 0  // mention character value inside the " " only 
	System.out.println(s1.indexOf("s"));  // -1 as the value is not mentioned here 
	System.out.println(s1.indexOf("i"));  // 3
	System.out.println(s1.indexOf("I"));  // -1 as the value is not present 
	System.out.println(s1.indexOf("g"));  // 5
	System.out.println(s1.indexOf('n'));  // we can also write inside the single inverted '' commas
	
	
	// to find the index of repeating characters like ababacbc
	
	String s4 ="ababacbc";
	
	System.out.println(s4.indexOf('a')); // 0 // it only gives the first index and not search for second index 
	System.out.println(s4.indexOf('b'));  // 1 once it gives the index value it does not look for other chars
	System.out.println(s4.indexOf('c'));  // 5 
	
//	
	
//  S  t  r  i  n  g  characters inside the s1 object 
//	0  1  2  3  4  5  index value 
	
//	to find the substring 
	
	System.out.println(s1.substring(3,5)); // it will only print the in not the g because its the size only 
	
	
	System.out.println(s1.substring(2));  // ring from the specific index we mentioned 
	
	System.out.println(s1.substring(1,4));  // tri only 
	
	System.out.println(s1.substring(0));  // String 
	
	
	// to replace the in formation with the another information 
	
	// we use the replace command 
	
	System.out.println(s1.replace("String", "Pranav"));
	
	System.out.println(s1+s2);
	
	System.out.println(s1.concat(s4));

	
	
	
	
	
	
	
	}
	

}

package String;

public class LengthMethod
{

	public static void main(String[] args) 
	{
		String a="bhuvaneshwari";
//		          012345678910111213
////		1.length method
//		System.out.println(a.length());
////		2.charAt method 
//		System.out.println(a.charAt(1));//0,1,2,3,4,5,6,7----to find the letter of that index
//		
//		for (int i=0;i<a.length();i++)//for seperating the letters
//		{
//			System.out.println(a.charAt(i));
//		}
////		3.concat method---to combine two methods
//		String b="Charate";
//		System.out.println(a.concat(b)); //combining two string 
//		
////		4.toUppercase method
//		System.out.println(a.toUpperCase());
//		
////		5.tolowercase method
//		System.out.println(a.toLowerCase());
//		
////		6.startswith method 
//		System.out.println(a.startsWith("Bhu"));// true
//		System.out.println(a.endsWith("ri"));//true
//		System.out.println(a.startsWith("bhu"));//false
//		System.out.println(a.endsWith("Wari"));//false
////		8.equal methos
//		System.out.println(a.equals("Bhuvaneshwari"));//true
//		System.out.println(a.equals("bhuvaneshwari"));//false 
//		9.equalIgnorecase method
		System.out.println(a.equalsIgnoreCase("bhuvaneshwari"));//true
		System.out.println(a.equalsIgnoreCase("BHUVAneshwari"));//true
//		10.Substring method
		System.out.println(a.substring(6));
		System.out.println(a.substring(3,7));
//		12.trim method 
		
		System.out.println(a.trim());
//		==operators
	
		
		
		
		
		
		
		
		
	
}}

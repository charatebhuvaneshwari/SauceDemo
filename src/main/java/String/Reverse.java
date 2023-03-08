package String;

public class Reverse {

	public static void main(String[] args)
	{
	String a="Bhuvaneshwari";
	
	String rev=" ";
	char x;
	
	for(int i=0;i<a.length();i++)
	{
		x=a.charAt(i);
		rev=x+rev;
	}
	System.out.println(rev);
	
////sentence  reverese
//	String b="Thank you";
//	for(int j=(b.length()-1);j>=0;j--)
//		
////	for(int j=0;j<b.length();j++)
//	{
//		System.out.print(b.charAt(j));
//	}
//	System.out.println();

//	//-------------word reverse---------------
//		String a="java";
//		
//		for(int i=(a.length()-1);i>=0;i--)
//		{
//			System.out.print(a.charAt(i));
//		}
//		System.out.println();
		
	//----------sentence reverse------------
//		String b="welcome in java programming";
//		for(int j=(b.length()-1);j>=0;j--)
//		{
//			System.out.print(b.charAt(j));
//		}
//		System.out.println();
		
		String c="this is java program";
		String d[]=c.split(" ");
		
		for(int i=d.length-1;i>=0;i--)
		{
			System.out.print(d[i] +" ");
		}

	
	}

}

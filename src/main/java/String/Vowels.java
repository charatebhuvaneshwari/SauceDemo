package String;

public class Vowels {
	public static void main(String[] args) {
		String b="programming";
		String c="aeiou";
		int vovels=0,consonent=0;
		
		for(int j=0;j<b.length();j++)
		{
			boolean value=false;
			for(int k=0;k<c.length();k++)
			{
				if(b.charAt(j)==c.charAt(k))
				{
					value=true;
				}
		
			}
			if(value==true)
			{
				vovels++;
			}
			else
			{
				consonent++;
			}
		}
		System.out.println("Vovels: "+vovels);
		System.out.println("Consonent: "+consonent);
//		--------------------------------------
//		tring a= "RAhul";
//		String b= a.toLowerCase();
//		int countV =0;
//		int countC=0;
//		for(int i=0;i<b.length();i++) {
//		
//		//	String b=a.charAt(i);
//			
//			if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u') {
//				
//				countV =countV+1;
//			}
//			else {
//				countC=countC+1;
//			}
//		}
//		System.out.println("number of vovels "+ countV);
//		System.out.println("number of consonent "+ countC);
//		
	}

}

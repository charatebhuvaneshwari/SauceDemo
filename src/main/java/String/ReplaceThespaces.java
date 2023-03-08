package String;

public class ReplaceThespaces
{
public static void main(String[] args) {
	
//	String a="this is demo";
//	System.out.println(a.replace(" ","*"));
//	
//	String b=" Bhuvan eshwari ";
//	System.out.println(b.replace(" ","*"));
	
	String a=" welcome in java program ";
	String x="";
	for(int i=0;i<a.length();i++)
	{
		String b="";
		b=b+a.charAt(i);
		if(b.equals(" "))
		{
			b=b.replace(b.charAt(0),'*');
		}
		x=x+b;
	}
	System.out.println(x);
			
	
	
	
}
}

package String;

public class UpperCaseToLowerCase {

	public static void main(String[] args) {
		String a="pROGramMIng";
		String x="";
		String b=a.toUpperCase();
		String c=a.toLowerCase();
		for(int i=0;i<a.length();i++)
		{
			String n="";
			n=n+a.charAt(i);
			if(a.charAt(i)==b.charAt(i))
			{
				n=n.replace(n.charAt(0),c.charAt(i));
			}
			else
			{
				n=n.replace(n.charAt(0),b.charAt(i));
			}
			x=x+n;
		}
		System.out.println(x);

	}

}

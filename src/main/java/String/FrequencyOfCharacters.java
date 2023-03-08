package String;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
	String a="Bhuvaneshwari";
	for (int i=0;i<a.length();i++)
	{
		int count =0;
		boolean value=false;
		for(int k=0;k<i;k++)
		{
			if(a.charAt(i)==a.charAt(k))
			{
				value=true;
			}
		}
		if(value==false)
		{
			for(int j=i;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(a.charAt(i)+"-"+count +" ");
			}
		}
	}

	}

}

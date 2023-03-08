package String;

public class FrequencyOfword {

	public static void main(String[] args)
	{
String a="welcome in java in automation programming";
		
		String word[]=a.split(" ");
		
		for(int i=0;i<word.length;i++)
		{
			int count=0;
			boolean value =false;
			for(int k=0;k<i;k++)
			{
				if(word[k].equals(word[i]))
				{
					value=true;
				}
			}
			if(value==false)
			{
			for(int j=i; j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					count++;
				}
			}
//			if(count>1)
//			{
//			System.out.println(word[i]);
//			}
			System.out.println(word[i]+"="+count);
			}
		}

	}

}

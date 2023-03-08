package String;

public class DublicateCharacters {

	public static void main(String[] args) {
		String a="progrooammmmming";
		String b="";
		
		for(int i=0;i<a.length();i++)
		{
			boolean val=true;
			
				for(int k=0;k<i;k++)
				{
					if(a.charAt(i) ==a.charAt(k))
					{
					val=false;
				}
				}
			if(val==true)
			{
			for(int j=i+1;j<a.length();j++)
			{
				if(a.charAt(i) ==a.charAt(j))
					{
						System.out.println("Duplicate char in strings are: "+a.charAt(i));
						break;
						
						
					
				}
			}}
		
		
		
		}
	}

}

package String;

public class ArrayToString {
	public static void main(String[] args) {
		
		String a[]= {"My","name","is","Bhuvaneshwari"};
		
		String b=" ";
		
		for(int i=0;i<a.length;i++)
		{
			b=b+a[i]+" ";
			
		}
		System.out.println(b);
		
		String[]fruits=new String[]
				{
						"Orange","Olive","Onion","Kiwi","Apricot"	
				};

		for(String fruit:fruits)
		{
			if(fruit.toLowerCase().startsWith("o"))
			{
                System.out.println(fruit);
			}
		}
	}

}

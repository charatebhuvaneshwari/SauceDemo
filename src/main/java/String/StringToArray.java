package String;

public class StringToArray {

	public static void main(String[] args) {
	String a="my name is bhuvaneshwari";
	
    String b[]=a.split(" ");// where we want to spilt  we use split method
    for(int i=0;i<=b.length-1;i++)
    {
    	System.out.println(b[i]);
    }

	}

}

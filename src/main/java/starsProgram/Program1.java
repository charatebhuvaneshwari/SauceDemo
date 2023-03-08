package starsProgram;

public class Program1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
				
		
		{
			System.out.print("*");
		
		}
		System.out.println();
	}
		int[] num = new int[10];
		for(int i=0;i<10;i++){
		    for(int j=0;j<i+1;j++) {
		        if(j==0||j==1){
		            num[j] = j+1;
		            System.out.print(num[j]+" ");
		        }
		        else{
		            int lastPre = num[j-2];
		            int  pre= num[j-1];
		            num[j] = lastPre+pre;
		            System.out.print(num[j] + " ");
		        }
		    }
		    System.out.println();
		}

	}

}

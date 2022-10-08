import java.util.Scanner;

public class EvenOdd {
		public static void main(String[]args) {
			Scanner scn=new Scanner (System.in);
			int []ar=new int[5];
			int i;
				
			for( i=0;i<ar.length;i++)
				
			{
				System.out.println("print values");
				ar[i]=scn.nextInt();
				if(ar[i]%2==0)
				{
					System.out.println("value is even");
				}
				else
				{
					System.out.println("value is odd");
				}
			}
		
	}

}

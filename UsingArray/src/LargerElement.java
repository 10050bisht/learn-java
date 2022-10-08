import java.util.Scanner;

public class LargerElement {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		int []ar=new int[5];
		int i;
			
		for( i=0;i<ar.length;i++)
			
		{
			System.out.println("print values");
			ar[i]=scn.nextInt();
	}
			int LargeNo=0;
			for(int x:ar)
			{
				if(x>LargeNo)
				{
					
					LargeNo=x;
				}
			}
			System.out.println(LargeNo);
}
}

import java.util.Scanner;

public final class LargeSmall {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		int []ar=new int[5];
		int i;
			
		for( i=0;i<ar.length;i++)
			
		{
			System.out.println("print values");
			ar[i]=scn.nextInt();
	}
			int No=0;
			for(int x:ar)
			{
				if(x>No)
				{
					
					No=x;
				}
			}
			System.out.println("LargeNo is"+No);
			
			for(int y:ar)
			{
				if(y<No)
				{
					No=y;
				}
			}	
			System.out.println("SmallNo is"+No);
	}

}

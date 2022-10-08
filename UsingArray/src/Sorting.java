

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		int n,temp;
		Scanner scn=new Scanner (System.in);
		System.out.println("Enter the eleement you watnt in array");
		n=scn.nextInt();
		int a[]=new int [n];
		System.out.println("Enter all the element");
		for(int i=0;i<n;i++)
		{
			a[i]=scn.nextInt();
	

		for( i=0;i<n;i++)	
		{
			for(int j=i+1;j<n;j++)
			{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
			}
			
			System.out.println("Ascending order ");
		for(int i1=0;i1<n-1;i1++)
		{
			System.out.println(a[i1]+";");
		}
		System.out.println(a[n-1]);
		
		
	}

}
}

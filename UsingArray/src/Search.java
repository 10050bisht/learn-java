	import java.util.Scanner;

import javax.naming.directory.SearchControls;
	
	public class Search {
	
		

		public static void main(String[] args) {
			int n,x,flag=0,i=0;
			Scanner scn=new Scanner (System.in);
			System.out.println("Enter the eleement you watnt in array");
			n=scn.nextInt();
			int a[]=new int [n];
			System.out.println("Enter all the element");
			for(i=0;i<n;i++)
			{
				a[i]=scn.nextInt();
			}
			System.out.println("Enter the element you want to find");
			x=scn.nextInt();

			for( i=0;i<n;i++)	
			{
				if(a[i]==x)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
			}
			if(flag==1)
			{
				
				System.out.println("Element found ");
			}	
			else
			{
				System.out.println("Element not found");
			}
			
			
			
	}
		
	}
	
	

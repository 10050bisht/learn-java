import java.util.Scanner;
public class Remove{

    public static void main(String args[]) {
    	
    	int n,x,flag=0,i=0,f;
    	Scanner scn=new Scanner (System.in);
    	System.out.println("Enter the eleement you watnt in array");
    	n=scn.nextInt();
    	int a[]=new int [n];
    	System.out.println("Enter all the element");
    	for(i=0;i<n;i++)
	    	{
	    		a[i]=scn.nextInt();
	    	}
    	System.out.println("Enter the element you want to remove");
    	x=scn.nextInt();

    	for( i=0;i<n;i++)	
    		{
    			if(a[i]==x)
    		{
    			flag=0;
    			break;
    		}
 			else
    		{
    			flag=1;
    		}
    		}
    		if(flag==0)
   			{	
    			System.out.println("Element found ");
    			
    		}	
    		else
    		{
    			System.out.println("Element not found");
    		}
    			int b[]=new int[a[i]];
    			System.out.println("Enter rest of the element");
    	    	for(int j=0;j<(n-1);j++)
    		    	{
    		    		b[j]=scn.nextInt();
    		    	}
    	   
    	}										    	
    }
    			

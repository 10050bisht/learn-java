import java.util.Arrays;

public class UsingharAt 
{
	public static void main(String[] args) 
	{
		String str="Selenium is open test user";
		char ch[]=str.toCharArray();
		String newstr="";
		System.out.println(Arrays.toString(ch));
		 
		for( char val:ch) 
		{
			if(val==' ') {
				continue;
			}else {
				newstr+=val;
			}
		}
		
		
		System.out.println(newstr);		
	}	
	 		
}


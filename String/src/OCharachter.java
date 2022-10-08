
public class OCharachter {

	public static void main(String[] args) {
		String str="techologytttt";
		int countChar=0;
		str=str.trim();
		 char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]=='t')
			{
				countChar++;
				
			}
			
		}
		System.out.println(countChar);
		
		
		
		
	}

}

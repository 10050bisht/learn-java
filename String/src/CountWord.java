
public class CountWord {

	public static void main(String[] args) {
		String str="Selenium is open test user";
		 
		int countWords=1;
		str=str.trim();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			 if(ch==' ') {
				 countWords++;
			 }else {
				 System.out.println("no");
			 }
		}
		System.out.println(countWords);
		
		
		
	}

}

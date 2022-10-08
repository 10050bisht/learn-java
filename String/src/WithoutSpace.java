
public class WithoutSpace {

	public static void main(String[] args) {
		String str="Selenium is open test user";
		 String[] st=str.split(" ");
		 String newString="";
		 for( String val : st)
		 {
			newString += val;
		 }
		
		System.out.println(newString);
		
	}

}




public class VowelConstant {

	public static void main(String[] args) {
		String str="aeioubcdef";
		 String[] st=str.split("aeiou");
		 String newString="";
		 for( String val : st)
		 {
			newString += val;
		 }
		System.out.println(newString);
	
	}
}

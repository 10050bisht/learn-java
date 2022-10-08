
public class Palidrome {
	public static void main(String[] args) {
		String str="mam";
	
		
		String temp = str;
		String revStr="";
		int n=str.length();
		for(int i=(n-1);i>=0;i--)
		{
			char ch = str.charAt(i);//g
			revStr =revStr+ch;//""+y=yg
		}
		System.out.println(revStr);
		System.out.println(revStr);
		if(temp.equals(revStr)) {
			System.out.println("pallindrom");
		}else {
			System.out.println("Not a pallindrom");
		}
	
		}

	}


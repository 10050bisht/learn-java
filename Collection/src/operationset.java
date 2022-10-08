import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class operationset {

	public static void main(String[] args) {
		HashSet<String> hset1= new HashSet();
		hset1.add("SQA");
		hset1.add("SELNIUM");
		hset1.add("JAVA");
		
		
		
		HashSet<String> hset2=new HashSet();
		hset2.add("MANUAL");
		hset2.add("SELNIUM");
		hset2.add("AUTOMATION");
		hset2.addAll(hset1);
		System.out.println("prnit all values "+ hset2);
	
		}
}

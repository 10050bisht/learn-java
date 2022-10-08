import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<String, String> tab=new Hashtable<String, String>();
		tab.put("1","Himanshu");
		tab.put("2","Ambala");
		tab.put("3","Automation");
		
			System.out.println(tab);
			
			Hashtable<String, String> tab2=new Hashtable<String, String>();
			tab2.put("4","Himanshu");
			tab2.put("5","Ambala");
			tab2.put("6","Automation");
			tab.putAll(tab2);
				System.out.println(tab);
}
}

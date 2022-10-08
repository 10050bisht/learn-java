
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MAPmethod {

	public static void main(String[] args) {
	
		Map<String, String> map1= new HashMap<String, String>();
		map1.put("1","Himanshu");
		map1.put("2","Ambala");
		map1.put("3","Automation");
		for(Map.Entry e: map1.entrySet()) {
		e.getKey();
		e.getValue();
		System.out.println(e);
		}
		
		Map<String,String> map2= new HashMap<String, String>();
		map2.put("4","Tarun");
		map2.put("5","Chandigrah");
		map2.put("6","Manual");
		for(Map.Entry e: map2.entrySet()) {
		e.getKey();
		e.getValue();
		System.out.println(e);
		}
		
	}

}

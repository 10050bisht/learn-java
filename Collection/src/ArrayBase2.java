import java.util.ArrayList;
import java.util.Iterator;

public class ArrayBase2 {
	int a=3;
	
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.remove(2);
		al.add(40);
		al.add(50);
		al.add(60);
		
		 
		ArrayBase2 obj=new ArrayBase2();
		ArrayBase2 obj1=new ArrayBase2();
		ArrayBase2 obj2=new ArrayBase2();
		System.out.println(obj.a);
		System.out.println(obj1.a);
		
		System.out.println("size of ArrayLsit" + al.size());
		System.out.println(al);
		System.out.println(al.containsAll(al));
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
	}

}

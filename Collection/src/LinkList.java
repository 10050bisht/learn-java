import java.util.ListIterator;
import java.util.LinkedList;

public class LinkList {

	private static final String LinkedList = null;

	public static void main(String[] args) {
		LinkedList<Integer> ll= new LinkedList ();
		ll.add(10);
		ll.addFirst(100);
		ll.add(20);
		ll.addLast(200);
		ll.add(30);
		ll.addFirst(300);
		ll.add(40);
		ll.addLast(400);
		ll.add(50);
		ll.add(60);
		
		
		ListIterator itr=ll.listIterator();
		
		//System.out.println("size of array "+ ll.size());
//		while(itr.hasNext()) {
//		System.out.println(itr.next());
//		}
//		//System.out.println("Link list"+ ll);
//	//	System.out.println("link list"+ LinkedList) ;
//		ll.remove(5);
//		ll.remove(2);
//		ll.addFirst(6);
//		ll.addLast(4);
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
			}
		System.out.println(" previous list"+ ll);
		
//		System.out.println( ll.addAll(1, ll));
}
}

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2  {
	int a=900;
	public static void m2()
	{ 
		System.out.println("child method calling");
	}

	public static void main(String[] args) {
		 
		ArrayList1 obj=new ArrayList1();
		ArrayList2 obj1=new ArrayList2();
		ArrayList al= new ArrayList();
		al.add(obj);
		al.add(obj1);
		 
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) 
		{ 
			 
			Object object = itr.next();
			String cName = object.getClass().toString();
			//System.out.println(str);
			if(cName.contains("ArrayList1")) {  
				ArrayList1 a1 = (ArrayList1)object;
				a1.m1();
				System.out.println(a1.a);
			}else if(cName.contains("ArrayList2")) {
				 
				ArrayList2 a2 = (ArrayList2)object;
				 
				System.out.println(a2.a);
			}
			
			 
		}
		
	}
}



import java.util.HashMap;
import java.util.Map;

public class Mainclass {

	public static void main(String[] args) {
		Teacher t1=new Teacher("Teacher_1");
		Teacher t2=new Teacher("Teacher_2");
		Student s1=new Student("Student_1");
		Map<Teacher,Student>mp=new HashMap<Teacher,Student>();
		mp.put(t1,s1);
		mp.put(t2,s1);
		System.out.println(mp);
		for(Map.Entry<Teacher,Student> e :mp.entrySet()) {	
		Teacher ob=e.getKey();
		Student ob1=e.getValue();
		System.out.println();	
		}
		t1.tch();
		t2.tch();
		s1.stu();
		
	}
}

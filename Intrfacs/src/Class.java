
public class Class implements Interface1 , Interface2 {
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		Interface1 obj=new Class();
		obj.m1();
		Class objj1=new Class();
		obj.m1();
		Interface1.m2();
		Interface2.m3();
		
		
}
	
	
}
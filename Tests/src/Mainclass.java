
public class Mainclass extends Aclass {
	
	void m1()
	{
		System.out.println("m1");
	}
	void m2()
	{
		m1();
		
		System.out.println("m2");
	}
	public static void main(String[] args) {
		Mainclass obj=new Mainclass();
		obj.m2();
	}

}

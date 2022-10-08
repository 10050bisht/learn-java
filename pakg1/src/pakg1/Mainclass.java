package pakg1;

public class Mainclass extends Aclass {
	public Mainclass(int x) {
	super(100);
	
		
		System.out.println("calling parameter construcor");
	}
	void m1()
	{
		System.out.println("child method");
	}
	
	public static void main(String[] args) {
		Mainclass obj=new Mainclass(0);
		obj.m1();
		
}
		
}

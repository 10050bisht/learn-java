
public class ThisWithinMethod {

	
	public ThisWithinMethod()
	{
		m2();
		System.out.println("const1");
	} 
	public ThisWithinMethod(int x)
	{
		this();
		System.out.println("const with one param");
	} 
	public ThisWithinMethod(int x,String  y)
	{
		this(x);
		System.out.println("const with 2parameters");
	}
	
	public void m1()
	{
		 
		System.out.println("m1");
	}
	public void m2()
	{
		m1();
		System.out.println("m2 method");	
	}
	public static void main(String[] args) {
		ThisWithinMethod obj= new ThisWithinMethod(100,200);

	}

}


	class NewCOnst {
	private int name;
	private int data;
	
	public void setvalue()
	{
		
	}
	public void getvalue() {
	System.out.println("name is Himanshu ");
	System.out.println("Password is ***  ");
	}

	public NewCOnst()
	{
		m2();
		System.out.println("const1");
	} 
	public NewCOnst(int x)
	{
		this();
		System.out.println("const with one param");
	} 
	public NewCOnst(int x,String  y)
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
		NewCOnst obj= new NewCOnst(100,200);

	}

	
}

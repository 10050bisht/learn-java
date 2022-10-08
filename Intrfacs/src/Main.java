
public  class Main implements I2{
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}

	public static void main(String[] args) {
		I1.m2();
		
		I2.m3();
		

	}

	
}

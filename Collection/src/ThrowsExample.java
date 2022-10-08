
public class ThrowsExample {
	public void m1() throws Exception{
		System.out.println("Hello");
		Thread.sleep(2000);
		System.out.println("Himanshu");
	}
	public static void main(String[] args) throws Exception {
		ThrowsExample obj=new ThrowsExample();
		obj.m1();

	}

}


public class ThrowExample {
	int a=10;
	int b=10;
	public void m1() {
		if (a>b) {
			throw new ArithmeticException("a is a grreater than b");
		}
	}
	public static void main(String[] args) {
		ThrowsExample obj=new ThrowsExample();
		try {
			obj.m1();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

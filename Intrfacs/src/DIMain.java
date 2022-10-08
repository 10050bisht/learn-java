
public class DIMain implements DI2 {
	
	public void m2() {
	m1();
	
	
	}
	//public void m3() {
	//	DI1.super.m3();
		
		
	//}


//	@Override
	//public void m1() {
	
	//	DI1.super.m1();
//	}
	public static void main(String[] args) {
		DIMain obj=new DIMain();
		obj.m1();
		obj.m3();
	}
}

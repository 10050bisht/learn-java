
public class ThisKeyword {
	int x;
	 
	public void m1(int x) {//non static method
		this.x =x;
		System.out.println(this);
	}
	
	public static void main(String[] args) {//static method
		ThisKeyword obj = new ThisKeyword();
		System.out.println(obj);//M/m address
		 
		obj.m1(100);
		System.out.println(obj.x);//10

	}

}
	
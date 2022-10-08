
public class Aclass {
		public Aclass(int i )
		{this();
			int a=15;
			System.out.println("obj");
		}
		public Aclass()
		{m1();
			int a=20;
			System.out.println("obj1");
		}
		void m1()
		{
			System.out.println("m1");
		}
		public static void main(String[] args) {
			Aclass obj =new Aclass(10);
		
	
		}

}
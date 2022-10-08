public class Mainclass extends AbstractDemoClass {
	 
	double salary;
	
	public  void abstmethod() {
		System.out.println("abs method");
	}
	
	public void Discount()
	{
		System.out.println("Dicount method");
	}
	public static void main(String[] args) {
		Mainclass obj=new Mainclass();
		obj.abstmethod();
		obj.Discount();
		obj.NonAbstract();
	}
}

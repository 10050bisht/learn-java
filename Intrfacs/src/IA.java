
public interface IA {
	int x=50;
	public void m1();
	public default void m2()
	{
		System.out.println("m2 of IA");
	}
	public static void m3()
	{
		System.out.println("m3 of IA");
		
	}
	
}

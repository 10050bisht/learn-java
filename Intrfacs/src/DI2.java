
public interface DI2 extends DI1{
	public default void m1()
	{
		DI1.super.m1();
		System.out.println("m1 of DI2");
	}
}

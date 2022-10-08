package pkg1;

import java.util.Objects;

public  class Dclass extends Aclass  {
	 protected void m5()
	 {
		 System.out.println("Called m5");
	 }
	
	 public void m6()
	 {
		 System.out.println("Called m6");
	 }
	
	 public static void main(String[] args) {
		Aclass obj=new Dclass();
		obj.m1();
		obj.m2();
		obj.m3();
		
	}
}

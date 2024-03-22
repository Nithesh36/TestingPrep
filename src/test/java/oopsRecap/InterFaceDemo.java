package oopsRecap;

interface demo1{
	//public static final
	public int a=9;
	
	 public static void demo12() {
		 System.out.println("IN method");
	}
		//public abstract   by default
	  String vehicle();
	
}
public class InterFaceDemo implements demo1 {

	public static void main(String[] args) {
		
		/*
		 *  Interface fields are public, static and final by default,
		 *   and the methods are public and abstract.
		 */
		//static access via class name variable
		//public static final int a=9;
		//can't be override variable value , can't change access modifier
		//demo1.a=9;
	System.out.println();
	
	 demo1 d=new InterFaceDemo();
	 demo1.demo12();
	 System.out.println(d.vehicle());
	}


	@Override
	public String vehicle() {
		System.out.println("helo int");
		return "ss";
	
		
	}

}

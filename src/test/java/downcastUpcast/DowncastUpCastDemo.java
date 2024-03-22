package downcastUpcast;


 class Child extends DowncastUpCastDemo{
	
public void m1() {
	System.out.println("child m1");	
	}
public void m3() {
	System.out.println("child m3");	
	}
}
public class DowncastUpCastDemo {

	
	public void m1() {
		System.out.println("parent m1");
	}
	public void m2() {
		System.out.println("parent m2");
	}
	public static void main(String[] args) {
		//upcasting
		//Allow to access overridden method (m1)  and parent class non overridden method
		DowncastUpCastDemo d=new Child();
  
//		d.m1();
//	
//		d.m2();
	//d.m3(); // will lead to Error
		//downcast  to access child method non overridden method and parent methods overridden in child
	//parent class non overridden method
		Child c=(Child)d;
		c.m3(); //non overridden method child
		c.m2(); //non overridden parent
		c.m1();// Overridden method in child
		
	}

}

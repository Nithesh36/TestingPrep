package boundedTypeParameters;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

 class DemoPage extends BoundTypeDemo{

	 Integer  test(int f) {
 		System.out.println("from child");
 		super.test(f);
		 super.test4(f);
		return f;
 	}
	 Integer  test2(int f) {
		 System.out.println("from child non ovd");
		 
		 return f;
	 }

			
	
}

    public   class BoundTypeDemo {

    	Number test(int d) {
    		System.out.println("from pr");
			return d;
    	}
    	Number test4(int d) {
    		
    		System.out.println("from pr non ovd");
    		return d;
    	}
public static void main(String[] args) {
	
	BoundTypeDemo d=new DemoPage();
	d.test(0);
//	d.test4(0);
	
//	DemoPage c=	(DemoPage)d;
//	c.test2(0);
//	c.test4(0);
}
 

}

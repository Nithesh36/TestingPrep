package interviewPrep;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.IAssert;
import org.testng.asserts.IAssertLifecycle;
import org.testng.asserts.SoftAssert;
@Test(groups = "sanity")
public class TestNGGroupsClassLevel {
	static SoftAssert s=new SoftAssert();

	  @Test(groups = { "smoke"})
	  @Parameters("url")
	  public  static Boolean testMethod1(int a) {
		  System.out.println("smoke+sanity:test run"+a);
		 
		return true;
		
	
		
	  }
	 
	@Parameters("url")
	  public void testMethod2(int b) {
		  System.out.println("sanity:testMethod2 ");
		  System.out.println("test2:Pm value:"+b);
	  }
	 
	
	  public void testMethod3(  ) {
		  System.out.println("sanity:function test");

	  }
	 

	

}  

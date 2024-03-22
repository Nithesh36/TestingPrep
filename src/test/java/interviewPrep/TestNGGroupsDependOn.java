package interviewPrep;

import org.testng.annotations.Test;
public class TestNGGroupsDependOn {

	  @Test(groups = {"function"})
	  public void first() {
		  System.out.println("test run");
	  }
	  @Test(groups = {"function","checklist"})
	  public void last() {
		  System.out.println("test check");
	  }
	 
	
	 
	  @Test(dependsOnGroups = {"function","checklist"})
	  public void testMethod3(  ) {
		  System.out.println("function test");
	  }

}  //

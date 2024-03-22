package interviewPrep.TestNgSeries;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnGrpSkipTest {
  @Test(groups = "smoke")
  public void login() {
	  Assert.assertEquals(true, false);
  }
//  @Test(groups = "smoke")
//  public void Register() {
//  }
  
  @Test(groups = "sanity",dependsOnMethods =  "login")
  public void incrementCart() {
	  System.out.println("inctem Sanity");
  }
//  
//  @Test(groups = "sanity")
//  public void likeProduct() {
//	  
//  }
//  
//  @Test(groups = "smoke")
//  public void buyProuct() {
//	  
//  }
}

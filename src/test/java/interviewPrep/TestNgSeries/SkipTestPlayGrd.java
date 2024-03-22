package interviewPrep.TestNgSeries;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 import org.testng.Assert;
public class SkipTestPlayGrd {
	
	
@BeforeClass
public void Before() {
	Assert.assertEquals("jsjd", "jsjjd");
}
	@Test()
	//dependsOnMethods = "JR"
	public void DRF() {
		System.out.println("method One ran:");
	}
	/*
	 *  If any dependent method or  Before  Hooks fails all skip will Happen
	 *  Before Hooks fail all method will be skipped
	 *  Dependent Method fails  only DRF  Method only skip
	 */
	@Test(priority = 3)
	public void C() {
		System.out.println("method  two c ran:");
	}
	@Test(priority = 2)
	public void JR() {
		Assert.assertEquals("", "jsjd");
	}
}

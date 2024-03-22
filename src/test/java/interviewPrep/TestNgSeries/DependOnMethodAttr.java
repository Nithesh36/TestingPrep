package interviewPrep.TestNgSeries;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethodAttr {

	
	@Test(priority = 2)
	public void DRF() {
		System.out.println("method One ran:");
		Assert.assertEquals(true, false);
	}
	@Test(priority = 3, dependsOnMethods = {"JR","DRF"},alwaysRun = true)
	public void C() {
		System.out.println("method  two c ran:");
	}
	@Test(priority = 1)
	public void JR() {
		System.out.println("method  three JR ran:");
	}
}

package interviewPrep.TestNgSeries;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnGroupsAttr {

	//Normal Happyflow
//	@Test(dependsOnGroups = {"OS"})
//	public void DELL() {
//		System.out.println("method One ran:");
//	}
//	@Test(groups = "OS")
//	public void windows() {
//		System.out.println("method  two c ran:");
//	}
//	@Test(priority = 1)
//	public void Linux() {
//		System.out.println("method  three JR ran:");
//	}
	
	//skip checking
//	@Test(dependsOnGroups = {"OS"})
//	public void DELL() {
//		System.out.println("method One ran:");
//	}
//	@Test(groups = "OS")
//	public void windows() {
//		Assert.assertEquals("", "welcome");
//	}
//	@Test(priority = 1)
//	public void Linux() {
//		System.out.println("method  three JR ran:");
//	}
	
//	@Test(dependsOnGroups = {"OS"},alwaysRun = true)
//	public void DELL() {
//		System.out.println("method One ran:");
//	}
//	@Test(groups = "OS")
//	public void windows() {
//		Assert.assertEquals("", "welcome");
//	}
//	@Test(priority = 1)
//	public void Linux() {
//		System.out.println("method  three JR ran:");
//	}
	
//Soft Dependency
//	@Test(dependsOnGroups = {"OS"},alwaysRun = true)
//	public void DELL() {
//		System.out.println("method One ran:");
//	}
//	@Test(groups = "OS")
//	public void windows() {
//		Assert.assertEquals("", "welcome");
//	}
//	@Test(priority = 1)
//	public void Linux() {
//		System.out.println("method  three JR ran:");
//	}
}

package testNgPractice;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(ITestListenerLogic.class)
public class ITestListenersDemoTest  {

	
	@BeforeTest
	public static void PreReque() {
		System.out.println("Before Test Ran");
	}
	
	@Test(priority = 1)
	public void D() {
		System.out.println("method D ran:");
	}
	@Test(priority = 3)
	public void E() {
		System.out.println("method E ran:");
		Assert.assertEquals(0, null);
		
	}
	
	@Test(priority = 4,timeOut = 1000)
	public void F() throws InterruptedException {
		System.out.println("method F ran:");
		Thread.sleep(2000);
	}
	
	@Test(priority = 4,dependsOnMethods = "F")
	public void G() throws InterruptedException {
		System.out.println("method G ran:");
		
	}
	
}

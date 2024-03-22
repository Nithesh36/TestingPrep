package interviewPrep.TestNgSeries;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class IgnoreTestMthods {
		/**
	 * @param De
	 * @author nitt
	 */
	@Test()
	public void A() {
		Assert.assertEquals(true, false);
		

	}

	// ignoreMissingDependencies = true
	@Test(alwaysRun = true, dependsOnMethods = "A")
	public void B() {
		System.out.println("method  two c ran:");
	}

	@Test()
	public void C() {

		System.out.println("method   cfd ran:");
		SoftAssert softAssertion = new SoftAssert();

		softAssertion.assertEquals(9, 4);
		softAssertion.assertAll();

	}

//	@Test()
//	public void Test4() {
//		softAssertion.assertAll();
//	}
}

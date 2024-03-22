package softAssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class VerifySoftAssert {
   SoftAssert softAssert =new SoftAssert();
	@Test
	public void Demo() {
	
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed - testCasetwo");
		System.out.println("Soft assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed - testCasetwo");
		softAssert.assertAll();
		softAssert.assertTrue("Welcome".equals("welcome"), "Third soft assert pass - testCasetwo");
		System.out.println("*** test case two executed successfully ***");
			}
	
	@Test
	public void testCaseThree() {



		System.out.println("*** test case three started ***");
		softAssert.assertEquals("Hello", "Hello", "First soft assert passed - testCaseThree");
//		System.out.println("Soft assert success....");
//		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed - testCaseThree");
//		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed - testCaseThree");
		System.out.println("*** test case three executed successfully ***");

		
	}

}

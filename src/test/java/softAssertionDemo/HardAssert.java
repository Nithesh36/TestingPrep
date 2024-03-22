package softAssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {
	SoftAssert s=new SoftAssert();
	@Test
	public void demo() {
		System.out.println("parent2");
		
		s.assertEquals(false, true);
		System.out.println("error free");
		s.assertAll();
	}
	@Test
	public void Login() {
		

		System.out.println("child");
		
		
			}

}

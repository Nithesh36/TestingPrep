package interviewPrep.TestNgSeries;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Test()
//retryAnalyzer = ReTryListenerDemo.class
public class RetryTestUsingRetryInterface {
	
	public void app() { 
	
		Assert.assertFalse(false, "expected to be false");
	}

	@Test
	public void man2() {
		
		Assert.assertTrue(false, "expected to be true");
	}
	@Test
	public void vi() { 
		
		Assert.assertFalse(false, "expected to be false");
	}
}

package interviewPrep.TestNgSeries;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryListenerDemo implements IRetryAnalyzer  {
	int count=0;
		
	boolean retry=false;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<3) {
			
			count++;
			return true;
		}
		return false;
	}


}

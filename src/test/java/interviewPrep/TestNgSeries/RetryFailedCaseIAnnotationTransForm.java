package interviewPrep.TestNgSeries;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class RetryFailedCaseIAnnotationTransForm implements IAnnotationTransformer {
//to avoid  add using @Test(retryAnalyzer = ReTryListenerDemo.class)
	// in each class we are using this Listner with the help of this we can set annotation to each class
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(ReTryListenerDemo.class);
		
	}

}

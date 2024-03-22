
package interviewPrep;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class DependonMethod {

	
//	@Test
//	public void apple() {
//		System.out.println("a ran");
//		
//	}
//	@Test(dependsOnMethods = {"apple","methodC"})
//	public void methodB() {
//		System.out.println("ran b");
//		
//	}
//	@Test
//	public void methodC() {
//		
//		System.out.println("from c:");
//		
//		
//	}
//	
	
	
	
	
	
	
}

 class ParentClassTest
{
	@Test(dependsOnMethods = { "Mango" })
	public void Apple() { //one //two
		DependentTestExamples.ele++;
		System.out.println("Test method apple");
	}

	@Test
	public void Mango() {
		System.out.println("Test method Mango");
		DependentTestExamples.ele++;
	}
	@Test(dependsOnMethods = { "Apple" })
	public void venila() {
		System.out.println("Test venila method in Inherited test");
		
	}
}
 class DependentTestExamples extends ParentClassTest
 
{ public static  int ele=1;
    
//	@Test
	public void karate() {
		System.out.println("Test karate method in Inherited test");
		new ParentClassTest().Apple();
	}
}
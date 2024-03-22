package testNgIgnore;

import org.testng.annotations.Test;

public class DemopTestNg2 {

	@Test(priority = 2)
	public void test1() {
		System.out.println("t1 runs");
	}
	@Test(priority = 8)
	public void test2() {
		System.out.println("t2 runs");
	}
}

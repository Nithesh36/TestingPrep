package testNgIgnore;

import org.testng.annotations.Test;

public class DemopTestNg {

	@Test(priority =1)
	public void sanity() {
		System.out.println("sanity");
	}
	@Test(priority = 4)
	public void Regresion() {
		System.out.println("Regresion");
	}
	@Test
	public void zappyFlow() {
		System.out.println("HappyFlow");
	}
	
	
}

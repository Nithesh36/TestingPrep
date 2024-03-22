package testNgPractice;

import org.testng.annotations.Test;

public class DependOnMEthodTest {
	@Test(groups = "c")
	public void purchase() {
		System.out.println(" Buy product");
	}
	@Test(groups = "b")
	public void openUrl() {
		System.out.println("open url ");
	}
	@Test(groups = "a")
	public void Login() {
		System.out.println("Login product");
	}
}

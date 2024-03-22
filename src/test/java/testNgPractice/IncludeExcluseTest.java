package testNgPractice;

import org.testng.annotations.Test;

public class IncludeExcluseTest {

	@Test
	public void Login() {
		System.out.println("method One ran:");
	}
	@Test(priority = 3)
	public void SignOff() {
		System.out.println("method  two c ran:");
	}
	@Test(priority = 2)
	public void OpenURL() {
		System.out.println("method  three JR ran:");
	}
	
}

package interviewPrep;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class ScrollWebPage {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/questions/18871747/"
				+ "testng-retryanalyzer-only-works-when-defined-in-methods-test-does-not-work-in");
		 Robot robot = new Robot();

		 robot.keyPress(KeyEvent.VK_END);
		 robot.keyRelease(KeyEvent.VK_END);
		TimeUnit.SECONDS.sleep(1);
		 robot.keyPress(KeyEvent.VK_HOME);
		 robot.keyRelease(KeyEvent.VK_HOME);
		
	}

}

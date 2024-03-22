package interviewPrep;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PressEnterKeyWays {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		//press enter using \n method
		//driver.findElement(By.id("APjFqb")).sendKeys("chess \n");
		
		//Press Enter using sendKeys and Keys combination
		//driver.findElement(By.id("APjFqb")).sendKeys("chess"+Keys.ENTER);
//		driver.findElement(By.id("APjFqb")).sendKeys("chess");
		
		//press Enter using robot class
		driver.findElement(By.id("APjFqb")).sendKeys("chess");
		new Robot().keyPress(KeyEvent.VK_ENTER);
		new Robot().keyRelease(KeyEvent.VK_ENTER);
	}

}

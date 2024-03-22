package actionsPracticeAndKeyBoard;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PressEnterKeyWays {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		//press enter using \n method
		driver.findElement(By.id("APjFqb")).sendKeys("chess \n");
		
		//Press Enter using sendKeys and Keys combination
		driver.findElement(By.id("APjFqb")).sendKeys("chess"+Keys.ENTER);
	//	driver.findElement(By.id("APjFqb")).sendKeys("chess");
		
		//press Enter using robot class
		//new Robot().keyPress(KeyEvent.VK_ENTER);
		
		//new Robot().keyRelease(KeyEvent.VK_ENTER);
//		driver.findElement(By.id("APjFqb"))
		driver.manage().window().setSize(new Dimension(0, 0));
	}

}

package interviewPrep;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshMethods {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
//		driver.navigate().refresh();
		//driver.get("https://github.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("gg");

//		driver.navigate().to("url");
		JavascriptExecutor s=  (JavascriptExecutor) driver;
		s.executeScript("location.reload()");
//		s.executeScript("location.reload()");
//		driver.get(driver.getCurrentUrl());
		
//		new Robot().keyPress(KeyEvent.VK_F5);
		Robot robo=new Robot();
		robo.keyPress(0);
		robo.keyRelease(0);
	}

}

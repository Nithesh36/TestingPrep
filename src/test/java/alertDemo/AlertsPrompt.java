package alertDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPrompt {

	public static void main(String[] args) throws InterruptedException {
		
//
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
//				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(0, 0));
		driver.get("https://demoqa.com/alerts");
		
		
		//wait based alert
		//driver.findElement(By.id("timerAlertButton")).click();
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.alertIsPresent());
//		
//		driver.switchTo().alert().accept();
//		TimeUnit.SECONDS.sleep(1);
		
		//send values to alert
//		driver.findElement(By.id("promtButton")).Cle();
		driver.switchTo().alert().getText();
		Alert ar=	driver.switchTo().alert();
		TimeUnit.SECONDS.sleep(1);
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys(null);
		driver.switchTo().alert();
		TimeUnit.SECONDS.sleep(2);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("d");

	}

}

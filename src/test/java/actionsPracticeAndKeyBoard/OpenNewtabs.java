package actionsPracticeAndKeyBoard;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenNewtabs {

	public static void main(String[] args) throws AWTException, IOException  {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
//				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/");
		//-----------open a link in a new tab by clicking "Ctrl+ "a" Tag"
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[@href='/login']"))).keyUp(Keys.CONTROL).
//		
		build().perform();
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		//open a link in the same tab
		js.executeScript("window.location.href='https://github.com/sponsors'", " ");
//		js.executeScript("window.location.href='gogglr'");
//		js.executeScript("window.open('gt,con')");
		//open URL in a new tab
		js.executeScript("window.open('https://github.com/login', '_blank')");
		//open URL in a new tab using Robot class
//		Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_T);
		
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_T);
//		driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
//		driver.get("https://www.google.com/doodles");
//		System.out.println(driver.getCurrentUrl());
//		driver.findElement(By.xpath("//a[@href='/login']")).click();
	
//		driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(0));
//		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//		WebDriverWait wait=new WebDriverWait(driver,9);
		//wait.until(ExpectedConditions.visibilityOf);
		//wait.until(ExpectedConditions.elementToBeClickabl));
		///wait.until(ExpectedConditions.elementToBeSelected(By.id(null)));
		//wait.until(ExpectedConditions.alertIsPresent());

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.pollingEvery(Duration.ZERO);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("id")));
	}

}

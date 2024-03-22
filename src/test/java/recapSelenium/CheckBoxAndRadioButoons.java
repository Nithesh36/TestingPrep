package recapSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxAndRadioButoons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
//		System.setProperty("webdriver.chrome.driver", "");
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Check this']")).isEnabled();
		driver.findElement(By.xpath("//button[text()='Check this']")).isSelected();
		driver.findElement(By.xpath("//button[text()='Check this']")).isDisplayed();
		WebDriverWait wait =new WebDriverWait(driver,20);
		
		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("dte")))) 
		 *  -return type WebElement
		 */
		
		//checkBox
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("dte")))).click();
		
		//radioBox
//		check  by default checkBox selected or not
		//using js
     boolean ischecked=(boolean) ( (JavascriptExecutor)driver).executeScript("return document.getElementById('checkbox1').checked");
     System.out.println("ischecked or not-Js : "+ischecked);
     
     //using selenium
     driver.findElement(By.id("checkbox1")).click();
     System.out.println("ischecked or not-Native selenium : "+ driver.findElement(By.id("checkbox1")).isSelected());
      
	
//	WebDriverWait wait1=new WebDriverWait(driver, 12);
//	wait.until(ExpectedConditions.visibilityOf(null));
//	
//	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	
	}
	
	

}

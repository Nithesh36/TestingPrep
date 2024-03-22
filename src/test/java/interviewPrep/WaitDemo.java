package interviewPrep;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitDemo {

	public static void main(String[] args) {
//		try {
//  WebDriverManager.firefoxdriver().setup();
//  WebDriver driver =new FirefoxDriver();
//  driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//  WebDriverWait w=new WebDriverWait(driver,0);
////  w.until(ExpectedConditions.)
//  driver.get("https://practicetestautomation.com/practice-test-login/");
//  driver.findElement(By.tagName("a"));
//  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//  LocalDateTime now = LocalDateTime.now();  
//  System.out.println(dtf.format(now));  
// /// driver.findElement(By.);
//  System.out.println("ele2:"+dtf.format(now));
			
			try {
//				driver.findElement(By.x
				System.out.println("".charAt(1));
				System.out.println("try");
			} finally {
				// TODO: handle finally clause
				System.out.println("jss");
				int $indexOf = "demo".indexOf(0);
			}
		//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("im catch");
//			e.printStackTrace();
//		}
		System.out.println("we");
	}

}

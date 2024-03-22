package sfdcAutomation;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://fincap.atlassian.net");
		driver.findElement(By.id("username")).sendKeys("nitheshkumar.e_sqs@idfcbank.com");
		driver.findElement(By.id("login-submit")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("password")).sendKeys("Token#2234");
		driver.findElement(By.id("login-submit")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.navigate().to("https://fincap.atlassian.net/jira/software/c/projects/L3PS/issues/?filter=reportedbyme&jql=project%20%3D%20%22L3PS%22%20ORDER%20BY%20created%20DESC");
		TimeUnit.SECONDS.sleep(2);
		
	}

}

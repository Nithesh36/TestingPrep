package sfdcAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.lu.a;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UatEnvSfdc {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://idfc--jlguat.sandbox.my.site.com/IDFCLoans/s/login/");

//May@2022
		driver.findElement(By.cssSelector("[placeholder=\"Username\"]"))
				.sendKeys("vigneshwaran.r2@idfcfirstbharat.com.uat");
		driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("May@2022");
		driver.findElement(By.xpath("//button/span[text()=\"Log in\"]")).click();
		
		WebElement manageCenter= new WebDriverWait(driver, 8).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()=\"MANAGE CENTER OR GROUP\"]"))));
		manageCenter.click();
		 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Scroll down by a specified pixel value (e.g., 500 pixels)
    
		WebElement NavigatetoCenter = driver.findElement(By.xpath("(//label[text()='Sennakarai 03']//following::button)"));
//		 jsExecutor.executeScript("arguments[0].click()", NavigatetoCenter);
		jsExecutor.executeScript("window.scrollBy(0, 2200);");
		 new WebDriverWait(driver, 6).until(ExpectedConditions.elementToBeClickable(NavigatetoCenter));
		  NavigatetoCenter.click();
		WebElement navigateToGroup = driver.findElement(
				By.xpath("(((//label[text()=\"No. of Members\"])[2]//parent::div//parent::div)[1]//div)[4]//button"));
		 jsExecutor.executeScript("arguments[0].click()", navigateToGroup);
		 jsExecutor.executeScript("window.scrollBy(0, 500);");
		System.out.println(driver.getTitle());
		WebElement repeat = driver.findElement(By.xpath("//Button[text()=\"R\"]"));
		if (repeat.getAttribute("class").contains("disable-color")) {
			System.out.println("repeat can't be init");
			System.out.println("atribute value:class" + repeat.getAttribute("class"));
		}
		else {
			System.out.println("enabled:class value"+repeat.getAttribute("class"));
			
		}

	}
}

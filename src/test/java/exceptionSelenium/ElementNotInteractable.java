package exceptionSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementNotInteractable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");	
		TimeUnit.SECONDS.sleep(3);
		WebElement searchBox=	driver.findElement(By.cssSelector("#APjFqb"));
		searchBox.sendKeys("he",Keys.ENTER);
		searchBox.sendKeys("dd");
	}

}

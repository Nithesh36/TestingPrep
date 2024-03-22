package exceptionSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnHandledAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");	
		TimeUnit.SECONDS.sleep(3);
	WebElement searchBox=	driver.findElement(By.cssSelector(".btn-danger"));
	
	
	searchBox.click();
	driver.findElement(By.cssSelector("[href='WebTable.html']"));
	}

}

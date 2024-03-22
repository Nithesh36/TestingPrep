package interviewPrep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/");
		
		driver.findElement(By.xpath("//table[contains(@id,'cust')]//tr//td[text()='Selenium']"
				+ "//preceding-sibling::td//input")).click();
		driver.findElement(By.xpath("//table[contains(@id,'cust')]//tr//td[text()='Selenium']"
				+ "//following-sibling::td//a")).click();
		
}
}
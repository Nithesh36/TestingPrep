package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		if(driver.findElement(By.id("hbutton")).isDisplayed())
			System.out.println(driver.findElement(By.id("hbutton")).isDisplayed());
		else
			System.out.println(driver.findElement(By.id("hbutton")).isDisplayed());
	}

}

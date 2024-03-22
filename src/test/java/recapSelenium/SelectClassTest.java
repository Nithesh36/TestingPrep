package recapSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassTest {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", null);
		WebDriverManager.edgedriver().setup();
		WebDriver  driver=new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");
		//select single dropdown value
		//Select select=new Select(driver.findElement(By.id("drop1")));
//		select.selectByVisibleText("doc 4");
//		
//		System.out.println(select.getFirstSelectedOption().getAttribute("value"));
//		
//		System.out.println("all options availble");
//		
//		System.out.println(select.getOptions().get(2).getText());
		
		
		//select multiple dropdown Value
		Select select=new Select(driver.findElement(By.id("multiselect1")));
		select.selectByValue("audix");
		select.selectByVisibleText("swiftx");
		select.selectByIndex(1);
		//Select s=new Select(driver.findElement(By.id("df")));
		
//		select.des
		for(WebElement  selectEle:select.getAllSelectedOptions())

		System.out.println(selectEle.getText());
		Select s=new Select(driver.findElement(By.id("dd")));

		
	}

}

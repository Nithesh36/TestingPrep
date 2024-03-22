package recapSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.cypress.io/");
		new Actions(driver).moveToElement(driver.findElement(By.id("dropdownDocs"))).perform();
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String des="C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Desktop\\TakesSSsnap.png";
		FileHandler.copy(source, new File(des));
		
	}

}

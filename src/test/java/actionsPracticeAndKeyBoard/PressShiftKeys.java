package actionsPracticeAndKeyBoard;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import alertDemo.AlertsPrompt;

public class PressShiftKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Actions act=new Actions(driver);
	
		act.keyDown(Keys.SHIFT).sendKeys(driver.findElement(By.id("APjFqb")), "helo").sendKeys("demo").keyUp(Keys.SHIFT).perform();
			
		//		Action a=update.build();
//		a.perform();
		
		//set window size
		driver.manage().window().setSize(new Dimension(10, 0));
		//driver.manage().window().setSize(new Dimension(12,66));
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.switchTo().window(new ArrayList<>(driver.getWindowHandles()).get(0));

//		new ArrayList<>(driver.getWindowHandles());

	}

}

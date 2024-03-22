package seleniumSeries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropCmds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Static.html");
		WebElement sourceEle=    driver.findElement(By.id("angular"));
		WebElement TargetEle=    driver.findElement(By.id("droparea"));
		Actions act=new Actions(driver);
		act.dragAndDrop(sourceEle, TargetEle).perform();

		
		
		
	}

}

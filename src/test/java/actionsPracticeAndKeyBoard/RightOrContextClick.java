package actionsPracticeAndKeyBoard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightOrContextClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
				+ "\\chromedriver-win64\\chromedriver-wn64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo/input.html");
		Actions act=new Actions(driver);
		
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")));
		act.click(driver.findElement(By.xpath("//span[text()='Radio2']//preceding-sibling::input ")));
		TimeUnit.SECONDS.sleep(1);
		act.build().perform();
			driver.findElement(By.xpath("//span[text()='Radio2']//preceding-sibling::input "));
//		driver.manage().timeouts().implicitlyWait(0, null);
		//new WebDriverWait(driver,0);

		Actions act1=new Actions(driver);
		act.doubleClick();
		act.contextClick();
			//mouse over a element 
			act.moveToElement(null);
			
			
	}

}
//"webdriver.chrome.driver","path"
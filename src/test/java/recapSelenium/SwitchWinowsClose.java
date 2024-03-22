package recapSelenium;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWinowsClose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String home=driver.getWindowHandle();
		driver.findElement(By.name("newbrowserwindow123")).click();
		driver.findElement(By.name("123newmessagewindow321")).click();
		driver.findElement(By.name("145newbrowsertab234")).click();
		TimeUnit.SECONDS.sleep(2);
		 Set <String>windows=driver.getWindowHandles();
		for (String tab: windows) {
			//try {
			if(!tab.equals(home))
			{
			System.out.println("Title of page: "+driver.switchTo().window(tab).getTitle());	
			
			
			driver.switchTo().window(tab);
			driver.close();
			}
		//	}
//			catch (Exception $e) {
//				// TODO: handle exception
//			$e.printStackTrace();
//			}
 
		}
		
		driver.switchTo().window(home);
		//driver.findElements(By.xpath("//a[text()='Python for Automation']")).get(0).click();
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", 
//				driver.findElements(By.xpath("//a[text()='Home']")).get(0));
//			TimeUnit.SECONDS.sleep(2);
		new WebDriverWait(driver, 20).until(ExpectedConditions.
				visibilityOf(driver.findElement(By.xpath("//a[text()='Python for Automation']")))).click();
		//by index
		
		List<String>windowsInd=new LinkedList<>(driver.getWindowHandles());
		
//		windowsInd.get(0);/
		driver.switchTo().window(windowsInd.get(0));
		
		//Url \
	
		
	}

}

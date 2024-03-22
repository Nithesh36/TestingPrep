package sfdcAutomation;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JiraTestCasePass {

	public static void main(String[] args) throws InterruptedException {
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
//	    			+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); // Set the path t
		WebDriverManager.edgedriver().setup();
		 WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://fincap.atlassian.net/");
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("username")).sendKeys("arivazhagan.k@idfcfirstbharat.com");
		driver.findElement(By.id("login-submit")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("password")).sendKeys("Ifbl@2022");
		driver.findElement(By.id("login-submit")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.navigate().to("https://fincap.atlassian.net/browse/JLGS-23341");
		TimeUnit.SECONDS.sleep(2);

		List<WebElement> testCas = driver
				.findElements((By.xpath("//div[text()='New']//span")));
		WebDriverWait wait = new WebDriverWait(driver, 30000);
		wait.until(ExpectedConditions.visibilityOfAllElements(testCas));
		for (WebElement webElement : testCas) {
			System.out.println(webElement.getTagName());
			 
			((JavascriptExecutor) driver).executeScript("arguments[0].click()",
				webElement);
			
			WebElement pass=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Passed']")));
			((JavascriptExecutor) driver).executeScript("arguments[0].click()",
					pass);
			WebElement TestCasePassDropDown = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='resolution']")));
			Select s = new Select(TestCasePassDropDown);
			s.selectByValue("10008");
			driver.findElement(By.id("issue-workflow-transition-submit")).click();

		}

	}

}

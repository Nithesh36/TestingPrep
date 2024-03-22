package interviewPrep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SendValuesWithoutUsingFIndElement {
	static WebElement APjFqb;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
//		PageFactory.initElements(driver, SendValuesWithoutUsingFIndElement.class);
//		APjFqb.sendKeys("helo");
		driver.switchTo().activeElement().sendKeys("manfo");
	}

}

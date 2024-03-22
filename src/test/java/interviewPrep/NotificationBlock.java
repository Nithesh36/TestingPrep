package interviewPrep;

import java.awt.AWTException;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationBlock {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--print-to-pdf");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	
		driver.get("https://www.justdial.com/");
		 
		 System.out.println("done");
      
	}

}

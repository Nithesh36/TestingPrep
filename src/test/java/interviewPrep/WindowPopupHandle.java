package interviewPrep;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.collect.ImmutableMap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopupHandle {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
			+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth/");
	Thread.sleep(2000);
	}

	

}

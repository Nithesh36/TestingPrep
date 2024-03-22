package interviewPrep;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeMethods {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		//
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Desktop\\chrome-win64\\\\chrome.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--start-maximized");
		WebDriver driver = new  ChromeDriver(ch);
		//using chromeOptions
		//using selenium maximize
//		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
//using dimesinon
		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(1232   , 569);
		
//		driver.manage().window().setSize(d);
		
		driver.get("https://www.amazon.in");
//		org.openqa.selenium.Dimension d3=new org.openqa.selenium.Dimension(1232   , 569);
		
		
	}

}

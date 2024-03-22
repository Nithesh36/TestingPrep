package frames;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement parent = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(parent); //webElement
//		driver.switchTo().frame(name or id)
		//driver.switchTo().fra
		
//		driver.switchTo().frame(0) index
		driver.switchTo().frame(driver.findElement(By.id("d")));
		
//		System.out.println(driver.findElement(By.tagName("h5")).getText());
	//	driver.findElement(By.tagName("input")).sendKeys("helo");
		
		//switch to outside the frame(HomePage currently driver has a focus)
		//driver.switchTo().defaultContent();
		//System.out.println(driver.findElement(By.xpath("(//a)[4]")).getAttribute("href"));
		driver.switchTo().parentFrame(); //switch to the Parent frame or MainPage
		System.out.println(driver.findElement(By.xpath("(//a)[4]")).getText());
		System.out.println(driver.getWindowHandle());
        int [] ar={1,2,3,4,9,2,5,7};
       
	}

}

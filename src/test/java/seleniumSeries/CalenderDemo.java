package seleniumSeries;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
//				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//style 1 using send keys
//		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
//		WebElement calenderBox=    driver.findElement(By.id("first_date_picker"));
//		new Actions(driver).sendKeys(calenderBox,"10/18/2023"+Keys.ENTER).perform();
		
		//style 2 Date picker from calender 

		driver.get("https://jqueryui.com/datepicker/");
		WebElement prevMonth=driver.findElement(By.xpath("//a[@title='Prev']"));
		prevMonth.click();
		
		WebElement DatePicker=driver.findElement(By.xpath("//a[@data-date='11']"));
		DatePicker.click();
		
	}

}

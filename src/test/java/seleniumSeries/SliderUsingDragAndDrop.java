package seleniumSeries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderUsingDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resources/demos/slider/colorpicker.html");
		Actions a=new Actions(driver);
		WebElement slider=	driver.findElements(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]")).get(1);
		a.dragAndDropBy(slider, -120, 100).perform();

		
	}

}

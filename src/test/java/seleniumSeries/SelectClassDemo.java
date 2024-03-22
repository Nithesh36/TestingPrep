package seleniumSeries;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
//		Select dropdownBox=new Select(driver.findElement(By.cssSelector("[multiple]")));
//		dropdownBox.selectByIndex(0);
//		dropdownBox.selectByIndex(1);
//		System.out.println(dropdownBox.getAllSelectedOptions().get(1).getText());
//		System.out.println(dropdownBox.getFirstSelectedOption());

		driver.get("https://formstone.it/components/dropdown/demo/");
		Select dropdownBox = new Select(driver.findElement(By.cssSelector("#demo_basic")));
		dropdownBox.selectByIndex(1);
		// in some cases select class customized using Button tags even if we select
		// option tag drop-down will not close
		// to close hover menu we need to again click the dropdown selected

		dropdownBox.getFirstSelectedOption().click();
		List<WebElement> s = dropdownBox.getAllSelectedOptions();
		dropdownBox.getAllSelectedOptions();
		dropdownBox.getOptions();
		dropdownBox.getFirstSelectedOption();
		
	}

}

package interviewPrep;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchBrowser {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com/");

		WebElement companies = driver
				.findElement(By.cssSelector("a[title=\"Explore top companies hiring on Naukri\"]"));

		// JavascriptExecutor js=(JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('target', '_blank');", companies);

		companies.click();
		WebElement Register = driver.findElement(By.cssSelector("a[title=\"Jobseeker Register\"]"));

		// JavascriptExecutor js=(JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('target', '_blank');", Register);
		Register.click();
		driver.findElement(By.cssSelector("a[title=\"Naukri FastForward- Resume Services\"]")).click();
		String parent = driver.getWindowHandle();

		for (int i = 0; i < new ArrayList<String>(driver.getWindowHandles()).size(); i++) {

			if (driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(i)).getTitle()
					.equalsIgnoreCase("Resume Writing Services - CV - Bio data | Naukri Fastforward")) {
				driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(i));

				System.out.println(driver.getCurrentUrl());
				driver.close();
				break;
			}

		}
		driver.switchTo().window(parent);
		driver.close();
		//System.out.println("parent:"+driver.getTitle());

	}
}

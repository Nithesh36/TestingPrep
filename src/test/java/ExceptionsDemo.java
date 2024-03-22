import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptionsDemo {
	
	

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
//				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		WebDriver  driver=new ChromeDriver();
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.tagName("button")).click();
//		
//		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//span[text()='Performance']")).click();
//		
//		
//		driver.findElement(By.xpath("//span[text()=\"Maintenance\"]")).click();
//		
//	
//		WebDriverWait wait=new WebDriverWait(driver, 0);
		int ar[] = new int[12];
		
		try {
			ar[0]=32;
		System.out.println(ar[19]);
		System.out.println("Hurray im safe");
		}
		catch (Exception $e) {
			// TODO: handle exception
			$e.getMessage();
		}
		finally {
			System.out.println("finally");
		}
		
	}
}

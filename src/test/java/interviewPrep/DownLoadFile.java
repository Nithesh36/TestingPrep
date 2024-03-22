package interviewPrep;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownLoadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
	    			+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); // Set the path to your ChromeDriver executable
	        WebDriver driver = new  ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // Use your custom WebDriver
	        driver.get("https://www.browserstack.com/test-on-the-right-mobile-devices");
	        
	        driver.findElements(By.cssSelector(".download-csv a")).get(0).click();
	       //BrowserStack - List of devices to test on  
	        TimeUnit.SECONDS.sleep(6);

	        File file=new File("C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads");
	        File[] downloads=file.listFiles();
	       for (File $file : downloads) {
			if($file.getName().equals("BrowserStack - List of devices to test on.csv"))
			{
				System.out.println("file found: "+$file.getAbsolutePath());
				System.out.println($file.getName());
				break;
			}
		}
	
	}

}

package interviewPrep;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
	    			+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); // Set the path to your ChromeDriver executable
	        WebDriver driver = new  ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // Use your custom WebDriver
	        driver.get("file:///C:/Users/nitheshkumar.eshwaran@expleogroup.com/Documents/BTN.html");
	        
	        
	        driver.findElement(By.tagName("button")).click();
	        String fileLocation="C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Pictures\\Desktop\\Testing docs\\app\\girl_coapp.jpeg";
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(fileLocation),null);
	
	        Robot robot=new Robot();
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	}

}

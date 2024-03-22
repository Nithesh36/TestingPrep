package notificationsBlock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeBlock {

	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com"
			+ "\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
//		options.setCapability("ms:edgeOptions", "-inprivate");
//		options.setCapability("ms:edgeOptions", "--disable-notifications");
//		  
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		driver.get("https://www.google.com/");
		 
		 System.out.println("done");
      
	}

}



 
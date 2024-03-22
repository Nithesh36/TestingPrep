package interviewPrep;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImageDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
//		driver.get("https://demoqa.com/broken");
//		driver.get("https://omayo.blogspot.com/");
		driver.get("https://nitheshdemo.netlify.app/");
		driver.manage().window().maximize();
		//---------Timeout -Implicit wait-----------
//		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//		if(driver.findElement(By.xpath("(//p[contains(text(),\"Valid image\")]//following::img)[2]")).getAttribute("naturalWidth").equals("0")) {
//			System.out.println("element broken");
//		}
//		else {
//			System.out.println("element not broken");
//		}
//		String link=driver.findElement(By.id("selenium143")).getAttribute("href");
		String link = driver.findElement(By.xpath("(//a)[3]")).getAttribute("href");
		URL url = new URL(link);
		
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
	
//		connection.setRequestMethod("GET");

		connection.connect();

		int responseCode = connection.getResponseCode();
		System.out.println("code:" + responseCode);
		if (responseCode != 200 || responseCode >= 400) {
			System.out.println("Broken  URL: " + link);
		} else
			System.out.println("un broken  URL: " + link);

	}

}

package screenShotPack;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.io.FileHandler;

public class TakeSSInterFaceUse {

	public static void main(String[] args) throws IOException, InterruptedException {
//Take  visible part of the tab Screenshot
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("chess \n");
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		js.executeScript("window.open('https://github.com/login', '_blank')"," ");
		TimeUnit.SECONDS.sleep(3);
		File s=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destiantionFile="C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Pictures\\Camera Roll\\Edge_FileMethodSS.png";
		FileUtils.copyFile(s, new File(destiantionFile));

		
		//BufferedWriter io=new Bu
		BufferedImage image = ImageIO.read(s);
		String destiantion="C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Pictures\\Camera Roll\\Edge_img.png";
	    ImageIO.write(image, "png",new File(destiantion));
	    
	    //
	    boolean image1=ImageIO.write(image, "png", new File(""));

	
	}

}

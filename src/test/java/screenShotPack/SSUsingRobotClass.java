package screenShotPack;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SSUsingRobotClass {

	public static void main(String[] args) throws AWTException, IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
				+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://github.com/");

		JavascriptExecutor js=(JavascriptExecutor)(driver);
		js.executeScript("window.open('https://github.com/login', '_blank')"," ");

		//TAKE window screenshot -windows or tabs that are visible 
		Robot r=new Robot();

		System.out.println(driver.getCurrentUrl());
		//Using Robot class
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(screenSize);
		BufferedImage source=r.createScreenCapture(rect);
		File des=new File("C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\eclipse-workspace\\InterViewPack\\fs.png");
		ImageIO.write(source, "png", des);
		//Action act=(Action) new Actions();
		
	}

}

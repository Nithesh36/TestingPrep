package recapSelenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseCicks {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
//			System.seproperty("driver.chrome.driver","");

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		TimeUnit.SECONDS.sleep(2);
		//right click
		act.contextClick(driver.findElement(By.className("context-menu-one"))).perform();
		
		// double clikc
		act.doubleClick(driver.findElement(By.tagName("button"))).perform();
		
		Robot robot=new Robot();
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screen=new Rectangle(screenSize);
		BufferedImage image=  robot.createScreenCapture(screen);
		ImageIO.write(image, "png", new File("C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Desktop\\robot.png"));
	//org.openqa.selenium.io.FileHandler.copy(  image,  new File("C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Desktop\\robot.png"));
	}

}

package webdriverTutMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) throws IOException {
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jpetstore.aspectran.com/catalog/");
		//Take snap of particular Element
		/*File src = driver.findElement(By.xpath("(//a[@href=\"/pricing\"])[1]")).getScreenshotAs(OutputType.FILE);
		File des = new File(
				"C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\eclipse-workspace\\InterViewPack\\ElementSnap.png");
		FileHandler.copy(src, des);
		
		*/
//		
//		System.out.println(driver.findElement(By.tagName("a")).getCssValue("font-family"));
//		//width and height of element
//		System.out.println(driver.findElement(By.xpath("//*[@placeholder=\"Search\"]")).getSize());
//		System.out.println(driver.findElement(By.xpath("//*[@placeholder=\"Search\"]")).getRect().getX());
//		System.out.println(driver.findElement(By.xpath("//*[@placeholder=\"Search\"]")).getLocation());
//		System.out.println(driver.findElement(By.xpath("//*[@placeholder=\"Search\"]")).getClass());
		
			Integer ar[]= {1,3};
			ArrayList<Integer> ls=new ArrayList <>();
			ls.add(4);
			ls.add(49);
//			System.out.println(Arrays.toString(ar))
			
			System.out.println((ls));
	}

}

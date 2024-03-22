package recapSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");	
		//reterive value from Text box using Js
		String inputValue=(String) ((JavascriptExecutor)driver).
				executeScript("return arguments[0].value", driver.findElement(By.id("textbox1")));
		System.out.println("text Box value: "+inputValue);
		//clear textbox value
		driver.findElement(By.id("textbox1")).clear();
		//send value to textBox
		//driver.findElement(By.id("textbox1")).sendKeys("EDGE");
		String name="Nithesh";
		((JavascriptExecutor)driver).executeScript("arguments[0].value=' "+name+" ' ",  driver.findElement(By.id("textbox1")));
		//((JavascriptExecutor)driver).executeScript(“arguments[0].value='”+name+“'”, driver.findElement(By.id(“textbox1”)));
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+name+"'");
	}

}

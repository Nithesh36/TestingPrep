package interviewPrep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo {

	public static void main(String[] args) {
		
  WebDriverManager.chromedriver().setup();
  WebDriver  driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://letcode.in/table");
  WebElement table=driver.findElement(By.cssSelector("#simpletable tbody"));
  List<WebElement> rows=table.findElements(By.cssSelector("tr td"));
//	System.out.println("rows:"+rows.get(i).getText());
  for(int i=0;i<rows.size();i++) {
		System.out.println("rows table:I"+i+rows.get(i).getText());
	if(rows.get(i).getText().equalsIgnoreCase("Man")) {
		System.out.println("if loop done");
		if(i==0 || i==4 || i==8) {
		WebElement input=rows.get(i+3).findElement(By.tagName("input"));
	    input.click();
		
		
	  System.out.println("tagname;"+input.getTagName());
		}
		if(i== 1 || i==5 || i==9) {
			WebElement input=rows.get(i+2).findElement(By.tagName("input"));
		    input.click();
			
			
		  System.out.println("tagname;"+input.getTagName());
			}
			  }
  }
	}

}

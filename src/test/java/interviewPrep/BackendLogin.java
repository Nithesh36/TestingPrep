package interviewPrep;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Time;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public  class BackendLogin{
//@Test(priority = 1)
	public void  test1() {
}
//@Test(priority = 1)
public  void test2() {
}
public void test3() {
	System.out.println("test 3:non abs:Backend login");
	
}	
public void test11() {
	// TODO Auto-generated method stub
	System.out.println("backednd test11");
}
}

class P1 extends BackendLogin{

	@Override
	public void test1() {
		System.out.println("P1:test1");
		
	}

	@Override
	public void test2() {
		
		
	}
	

}

class child implements SearchContext {
  WebDriver d;
	//@Override
	public void test1() {
		System.out.println("P1:test1");
		
	}

	public void test4() {
		System.out.println("p1:non abs");
		
	}
	//@Override
	public void test2() {
		
		
	}

	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}
}
class TestAbstraction1 extends child{  
	int a,b;
	
	
	public void test11() {
		// TODO Auto-generated method stub
		System.out.println("TestAbstraction1 test11");
	}
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		System.out.println("findEle override");
		return null;
	}
public static void main(String args[]) throws InterruptedException, AWTException{  
child b=new  TestAbstraction1();
b.findElement(By.id("hh"));
WebDriverManager.chromedriver().setup();

WebDriver e =new ChromeDriver();
e.manage().window().maximize();
e.get("https://toolsqa.com/");
Actions a=new Actions(e);
WebElement e1=e.findElement(By.xpath("//a[@href=\"/selenium-training?q=headers\"]"));
//a.click(e.findElement(By.xpath("//a[@href=\"/selenium-training?q=headers\"]"))).perform();
//if(e1.isDisplayed()) {
//TimeUnit.SECONDS.sleep(2);
a.keyDown(Keys.CONTROL).click(e1).build().perform();
Robot rob = new Robot();
rob.keyPress(KeyEvent.VK_CONTROL);
rob.keyPress(KeyEvent.VK_T);

e.get("https://artoftesting.com/");
//a.co
//TestAbstraction1 b=new TestAbstraction1();
//b.test3();
//child c=(child) b;
//c.test4();
//b.test3();
//
//((TestAbstraction1)b).test9();
//((TestAbstraction1)b).test11();
//b.test11();

}

@Override
public void test1() {
	// TODO Auto-generated method stub
	
}

@Override
public void test2() {
	// TODO Auto-generated method stub
	
}  
//@Override
//public void test3() {
//	System.out.println("test 3:non abs:TestAbstraction1");
//	
//}
public void test9() {
	// TODO Auto-generated method stub
	System.out.println("test9");
} 
}
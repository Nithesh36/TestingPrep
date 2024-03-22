package interviewPrep;

import io.cucumber.java.hu.Ha;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

public class ExplictWiatErrorCheck {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver =new EdgeDriver();
        driver.get("https://ecommerce-playground.lambdatest.io/");
        WebDriverWait exp=new WebDriverWait(driver,2);
        WebElement sd = exp.until(ExpectedConditions.visibilityOfElementLocated(By.id("sd")));
        sd.click();

   //
      WebDriverWait wait=new WebDriverWait(driver,10);

      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("df")));



    }
}

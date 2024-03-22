package interviewPrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodCustom extends ChromeDriver {

    public GetMethodCustom() {
        // Call the constructor of the parent class (ChromeDriver)
        super();
    }

    @Override
    public void get(String url) {
        // Your custom implementation here
        System.out.println("Navigating to URL: " + url);
        super.get(url); // Call the get method of the parent class to perform the actual navigation
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nitheshkumar.eshwaran@expleogroup.com\\Downloads"
    			+ "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); // Set the path to your ChromeDriver executable
        WebDriver driver = new GetMethodCustom();
        
        // Use your custom WebDriver
        driver.get("http://github.com");
        driver.quit();
    }
}

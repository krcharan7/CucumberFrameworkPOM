package Cucumber.Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public WebDriver driver;

public WebDriver initializeDriver() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Chrome_89\\chromedriver.exe");
	  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	return driver;
	
}
}

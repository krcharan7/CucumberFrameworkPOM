package Cucumber.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	static WebDriver driver;
 public LoginPage(WebDriver driver) {
	 
	 LoginPage.driver=driver;
	 
 }
  

 static By signIn=By.xpath("//a[contains(text(),'Sign in')]");
 static By userName=By.xpath("//input[@id='login1']");
 static By password=By.xpath("//input[@id='password']");
 static By login=By.xpath("//input[@type='submit']");
 
 public static WebElement signingIn() {
	 return driver.findElement(signIn);
 }
 
 public static  WebElement userNamevalue() {
	 return driver.findElement(userName);
 }
 
 public static WebElement password() {
	 return driver.findElement(password);
 }
 
 public static WebElement loginButton() {
	 return driver.findElement(login);
 }
}

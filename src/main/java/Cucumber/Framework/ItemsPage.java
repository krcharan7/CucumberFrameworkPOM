package Cucumber.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemsPage {
	WebDriver driver;
 public ItemsPage(WebDriver driver) {
	 
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 
 }
 
 @FindBy(xpath="//input[@class='getquoteinput']")
  WebElement searchItems;
 @FindBy(xpath="//a[contains(text(),'rediff.com')]")
  WebElement rediff;

 @FindBy(css="p[class='bold f14'] span")
 WebElement company;
 

 @FindBy(xpath="//input[@id='srchword']")
 WebElement serchwordwoxfinal;
 
 //
 public WebElement serchwordwoxfinals() {
	 return serchwordwoxfinal;
	 
 }
 public WebElement rediffLinkText() {
	 return rediff;
	 
 }
 public WebElement searchItemsInRediff() {
	 return searchItems;
	 
 }
 public WebElement firstCompany() {
	 return company;
	 
 }
}
package org.seleniumhq.selenium.org.ultimatix;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Date_Dropdown {
	WebDriver driver;
	
  @Test
  public void Date_Change() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\1187494\\Downloads\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://jqueryui.com/datepicker/");
	  driver.manage().window().maximize();
	  
	  WebElement element = driver.findElement(By.xpath("//input[@id='datepicker']"));
	  String date= "30/12/2019";

	  JS_Method(driver, element, date);
	  Thread.sleep(4000);
	  driver.close();
	
	    }
  
  public void JS_Method(WebDriver driver, WebElement element, String date) {
	  JavascriptExecutor jse= ((JavascriptExecutor) driver);
	  jse.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
  }
  
}

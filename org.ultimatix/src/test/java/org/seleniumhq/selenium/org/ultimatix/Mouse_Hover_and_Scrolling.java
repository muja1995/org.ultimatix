package org.seleniumhq.selenium.org.ultimatix;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Mouse_Hover_and_Scrolling {
  
	 WebDriver driver;

	 @Test
	public  void MoveMouse() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\1187494\\Downloads\\chromedriver.exe");
	driver= new ChromeDriver();

	driver.get("http://mrbool.com/search/");
	Actions act= new Actions(driver);
	WebElement ele= driver.findElement(By.className("menulink"));
	act.moveToElement(ele).build().perform();
	Thread.sleep(4000);

	driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[1]/a")).click();

	JavascriptExecutor jse= (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000)");
	Thread.sleep(4000);

	jse.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(4000);

	WebDriverWait wait= new WebDriverWait(driver,10);
	WebElement ele1= driver.findElement(By.xpath("/html/body/section/header/nav[2]/div/div/div/div[1]/div/div[1]/img"));
	wait.until(ExpectedConditions.elementToBeClickable(ele1));

	Thread.sleep(3000);
	driver.quit();
	}
}

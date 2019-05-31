package org.seleniumhq.selenium.org.ultimatix;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class KeyEntries {
  
  WebDriver driver;
  
  @Test

	public void Keyboard_keys() throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\1187494\\Downloads\\chromedriver.exe");
driver= new ChromeDriver();

driver.get("https://pnl-pega-ncm-qa-us-east-1.watchpnl-np.nielsencsp.com/prweb");

driver.findElement(By.xpath("//input[@id='txtUserID']")).sendKeys("muja");
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("rules");
		/*
		 * 
		 * Actions act= new Actions(driver); act.sendKeys(Keys.ENTER).build().perform();
		 */

Actions act= new Actions(driver);
act.sendKeys(Keys.ENTER).build().perform();

WebDriverWait wait = new WebDriverWait(driver, 50);
WebElement ele = driver.findElement(By.xpath("//a[@class='nav-toggle-one']"));
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));

Thread.sleep(4000);
driver.quit();

	}

}
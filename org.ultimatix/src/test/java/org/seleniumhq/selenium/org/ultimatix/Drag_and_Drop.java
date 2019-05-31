package org.seleniumhq.selenium.org.ultimatix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_and_Drop {
	WebDriver driver;
	@Test
  public class Drag_Drop {

		 
		public  void DragDrop() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\1187494\\Downloads\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();

	driver.switchTo().frame(0);
	WebElement source= driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
	WebElement destination= driver.findElement(By.xpath("//div[@id='droppable']"));	

	Actions act= new Actions(driver);

	act.dragAndDrop(source, destination).build().perform();

	Thread.sleep(4000);

	driver.close();

		}

	}
	
}


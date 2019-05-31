package org.seleniumhq.selenium.org.ultimatix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Drop_Downs {

	WebDriver driver;

	@Test
	public void Handle_Dropdown() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1187494\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/"); 

		WebElement day = driver.findElement(By.id("day"));
		WebElement mon = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		SelectUtility(day, "10");
		SelectUtility(mon, "Feb");
		SelectUtility(year, "1985");

	}

	public static void SelectUtility(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

}

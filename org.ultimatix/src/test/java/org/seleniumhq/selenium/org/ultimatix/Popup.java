package org.seleniumhq.selenium.org.ultimatix;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Popup {

	WebDriver driver;

	public void Handle_Pop_Ups() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1187494\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		driver.manage().window().maximize();
		driver.get(url);

		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);

		if (alertText.equals("Please enter a valid user name")) {
			System.out.println("Valid Alert");
		} else {
			System.out.println("Invalid Alert");
		}

		alert.accept();
		Thread.sleep(3000);
		driver.quit();

	}
}

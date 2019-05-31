package org.seleniumhq.selenium.org.ultimatix;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropdownsWithoutSelect {
	static WebDriver driver;

	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1187494\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		String day_Xpath = "//select[@id='day']//option";
		String mon_Xpath = "//select[@id='month']//option";
		String year_Xpath = "//select[@id='year']//option";

		Gen_method(day_Xpath, "13");
		Gen_method(mon_Xpath, "Feb");
		Gen_method(year_Xpath, "1995");
	}

	public static void Gen_method(String Xpath, String value) {

		List<WebElement> date = driver.findElements(By.xpath(Xpath));
		int size = date.size();
		System.out.println(size);

		for (int i = 0; i < size; i++) {
			if (date.get(i).getText().equals(value)) {
				date.get(i).click();
				break;
			}

		}

	}

}
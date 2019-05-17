package Ultimatix_Def;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Test
public class Ultimatix_Def {

	WebDriver driver;

	@Given("^The URL is launched$")
	public void the_URL_is_launched() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1187494\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://auth.ultimatix.net/utxLogin/login?");

	}

	@When("^The UserID and PWD are entered$")
	public void the_UserID_and_PWD_are_entered() throws Throwable {
		// driver.findElement(By.xpath("//input[@id='form1']")).click();
		driver.findElement(By.xpath("//input[@id='form1']")).sendKeys("1187494");

		driver.findElement(By.id("proceed-button")).click();

		driver.findElement(By.id("password-btn")).click();
		driver.findElement(By.id("password-login")).sendKeys("Password@16");
		driver.findElement(By.xpath("//button[@id='form-submit']")).click();
	}

	@When("^Sign on is clicked$")
	public void sign_on_is_clicked() throws Throwable {
		System.out.println("click successfull");
		Thread.sleep(6000);
	}

	@Then("^Dash board is displayed$")
	public void dash_board_is_displayed() throws Throwable {

		String parentWindow = driver.getWindowHandle();
		for (String childwindow: driver.getWindowHandles()) 
			 {
				driver.switchTo().window(childwindow);
			 }
				String text = driver.findElement(By.xpath("//div[@class='notification-header']")).getText();
				System.out.println(text);
			 	driver.close(); // closing child window
				driver.switchTo().window(parentWindow);
			
		
		Thread.sleep(4000);
		driver.close();

	}
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement ele =
		 * driver.findElement(By.xpath("//button[@class='ui-dialog-titlebar-close']"));
		 * JavascriptExecutor jse= (JavascriptExecutor) driver; jse.
		 * executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');"
		 * , ele); wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//button[@class='ui-dialog-titlebar-close']")));
		 */
		 
	}



//ui-dialog-titlebar-close

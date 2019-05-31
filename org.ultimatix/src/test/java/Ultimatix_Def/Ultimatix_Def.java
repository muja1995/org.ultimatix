package Ultimatix_Def;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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

		driver.get("https://@auth.ultimatix.net/utxLogin/login?");
		
	}

	@When("^The UserID and PWD are entered$")
	public void the_UserID_and_PWD_are_entered() throws Throwable {
		// driver.findElement(By.xpath("//input[@id='form1']")).click();
		driver.findElement(By.xpath("//input[@id='form1']")).sendKeys("1187494");

		driver.findElement(By.id("proceed-button")).click();

		driver.findElement(By.id("password-btn")).click();
		driver.findElement(By.id("password-login")).sendKeys("Password@17");

	}

	@When("^Sign on is clicked$")
	public void sign_on_is_clicked() {
		driver.findElement(By.xpath("//button[@id='form-submit']")).click();
		// System.out.println("click successfull");

	}

	@Then("^Dash board is displayed$")
	public void dash_board_is_displayed() throws Throwable {

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		for (String childwindow : driver.getWindowHandles()) {
			System.out.println("childwindow is" +childwindow);
			driver.switchTo().window(childwindow);
		}
		String text = driver.findElement(By.xpath("//div[@class='notification-header']")).getText();
		System.out.println(text);
		//Actions act = new Actions(driver);
		driver.switchTo().window(parentWindow);

		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement menu = driver.findElement(By.id("menuDropdownImg"));
		WebElement allocation = driver.findElement(By.xpath("//*[@id=\"parentGroup_26\"]/div[1]/table/tbody/tr/td[1]/div/div[7]/div/div/a"));

		Actions act2 = new Actions(driver);
		act2.moveToElement(menu).build().perform();
		act2.moveToElement(allocation).build().perform();
		allocation.click();
		
		Set <String> tabs =driver.getWindowHandles();
		Iterator <String> jump= tabs.iterator();
		String oldtab = jump.next();
			System.out.println("Old Tab ID: "+oldtab);
		String newtab = jump.next();
			System.out.println("New Tab ID: "+newtab);
			
			driver.switchTo().window(newtab);
			WebElement current = driver.findElement(By.xpath("//button[@id='current']"));
			wait.until(ExpectedConditions.elementToBeClickable(current));
			Thread.sleep(4000);
			driver.close();
		
		driver.switchTo().window(parentWindow);
		
		Thread.sleep(4000);
		//driver.close();

	}
	
	
	  
	 
}

//ui-dialog-titlebar-close

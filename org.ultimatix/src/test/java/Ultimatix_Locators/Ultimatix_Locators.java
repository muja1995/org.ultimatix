package Ultimatix_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ultimatix_Actions.Ultimatix_Actions;

public class Ultimatix_Locators {
	
	WebDriver driver;
	
	public Ultimatix_Locators (WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='form1']")
	public WebElement username; 

	@FindBy(id="proceed-button")
	public WebElement proceed ;

	@FindBy(id="password-btn")
	public WebElement password;
	
	@FindBy(id="password-login")
	public WebElement enterPWD;
	
	@FindBy(xpath="//button[@id='form-submit']")
	public WebElement login;
	
	@FindBy(id="menuDropdownImg")
	public WebElement burgermenu;
	



}

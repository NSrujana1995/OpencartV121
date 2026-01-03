package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

	public HomePage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	//span[normalize-space()='My Account']
	WebElement myaccount_select;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	//a[normalize-space()='Register']
	WebElement register_select;
	
	@FindBy(linkText="Login")
	WebElement login_select;
	
	public void selectMyAccount()
	{
		myaccount_select.click();
	}
	
	public void selectRegister()
	{
		register_select.click();
	}
	
	public void selectLogin()
	{
		login_select.click();
	}

	
		
	

	
}

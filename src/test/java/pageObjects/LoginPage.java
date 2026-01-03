package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement inputEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement inputPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;
	
	public void enterEmail(String emailid)
	{
		inputEmail.sendKeys(emailid);
	}
	
	public void enterPassword(String pwd)
	{
		inputPassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}
	

	
}

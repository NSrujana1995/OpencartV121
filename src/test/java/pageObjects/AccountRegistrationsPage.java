package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationsPage extends BasePage
{

	public AccountRegistrationsPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement confirmPassword;

	@FindBy(xpath="//input[@type='checkbox']")
	WebElement privacyPolicy;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement continueBtn;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void enterFirstName(String fstname)
	{
		firstName.sendKeys(fstname);
	}
	
	public void enterLastName(String lstname)
	{
		lastName.sendKeys(lstname);
	}
	
	public void enterEmail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void enterPhoneNum(String num)
	{
		telephone.sendKeys(num);
	}
	
	public void enterPassword(String psword)
	{
		password.sendKeys(psword);
	}
	
	public void confirmPassword(String cnfmpsword)
	{
		confirmPassword.sendKeys(cnfmpsword);
	}
	
	public void privacyBoxCheck()
	{
		privacyPolicy.click();
	}
	
	public void continueBtnClick()
	{
		continueBtn.click();
	}
	
	public String getConfirmMessage() 
	{
		try
		{
			return(msgConfirmation.getText());
		}
		
		catch(Exception ex)
		{
			return (ex.getMessage());
		}
	}

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage extends BasePage
{

	public MyAccountPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement headerMsg;
	
	@FindBy(xpath="//div[@class='list-group']//a[text()='Logout']") //added in step 6
	WebElement logoutBtn;
	
	public boolean isMyAccountExisted() //no validation here
	{
		try 
		{
			return (headerMsg.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
		
	} 
	public void clickLogout()
	{
		logoutBtn.click();
	}
	

}

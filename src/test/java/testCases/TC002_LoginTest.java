package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;




public class TC002_LoginTest extends BaseClass
{
	@Test(groups="sanity")
   public void verify_login()
   {
	   logger.info("*** starting TC002_loginTest ****");
	   
	   try
	   {
		   HomePage hp=new HomePage(driver);
		   hp.selectMyAccount();
		   hp.selectLogin();
		   
		   LoginPage lp=new LoginPage(driver);
		   lp.enterEmail(p.getProperty("Email"));
		   lp.enterPassword(p.getProperty("password"));
		   lp.clickLogin();
		   
		   //My Account
		   
		   MyAccountPage accpage=new MyAccountPage(driver);
		   boolean targetPage=accpage.isMyAccountExisted();
		   Assert.assertTrue(targetPage);
		   
		   
	   }
	   catch(Exception e)
	   {
		   Assert.fail();
	   }
	   
	   
	   logger.info("*** TC002_loginTest Finished ***");
	   
   }
}

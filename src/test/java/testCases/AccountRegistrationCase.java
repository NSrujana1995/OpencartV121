package testCases;


import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationsPage;
import pageObjects.HomePage;


public class AccountRegistrationCase extends BaseClass
{
   @Test(groups="Regression")
   public void verity_account_registration()
   {
	   try
	   {
		   
	   
		   logger.info("****Starting verity_account_registration****");
		   HomePage hp=new HomePage(driver);
		   hp.selectMyAccount();
		   logger.info("Clicked on my account link");
		   hp.selectRegister();
		   logger.info("Clicked on register link");
		   
		   AccountRegistrationsPage regpage=new AccountRegistrationsPage(driver);
		   
		   //randomly generating
		   logger.info("Entering cutomer details");
		   regpage.enterFirstName(randomString().toUpperCase());
		   regpage.enterLastName(randomString().toUpperCase());
		   regpage.enterEmail(randomString() +"@gmail.com");
		   regpage.enterPhoneNum(randomNumber());
		   
		   String password=randomAlfaNumeric();
		   regpage.enterPassword(password);
		   regpage.confirmPassword(password);
		   regpage.privacyBoxCheck();
		   regpage.continueBtnClick();
		   
		   logger.info("Validating expected message");
		   
		   String confrmMsg=regpage.getConfirmMessage();
		   if(confrmMsg.equals("Your Account Has Been Created!"))
		   {
			   Assert.assertTrue(true);
		   }
		   else
		   {
			   logger.error("Test failed");
			   logger.debug("debug logs...");
			   Assert.assertTrue(false);
		   }
		   //Assert.assertEquals(confrmMsg, "Your Account Has Been Created!");
	   }
	   catch(Exception e)
	   {
		   
		   Assert.fail();
	   }
	  logger.info("**** Test finished****");
   }
   
  
   
}

package com.inetbanking.testCases;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.inetbanking.PageObjectModule.LoginPage;



public class TC001_LoginTest extends BaseClass{
	
	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		
		logger.info("Url is opened"); 
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered Username");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		lp.clickSubmit();
		
		Reporter.log(driver.getTitle(), true);
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
		
			Assert.assertTrue(true);
		
		}
		else {
			
			Assert.assertTrue(false);
			
		}
		
		
	}

}

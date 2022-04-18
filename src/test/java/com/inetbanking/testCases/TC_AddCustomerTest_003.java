package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObjectModule.AddCustomerPage;
import com.inetbanking.PageObjectModule.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {

	@Test
	public void AddNewCustomer() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		lp.setPassword(password);
		
		//Thread.sleep(2000);
		lp.clickSubmit();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.ClickAddNewCustomer();
		addcust.custName("Akshay");
		addcust.custGender();
		addcust.custDob("07", "29", "1996");
		Thread.sleep(2000);
		addcust.custAddresse("Barhanpur");
		addcust.custCity("Amravati");
		addcust.custState("Maharashtra");
		addcust.custPin(444801);
		addcust.custTelephoneNo("9988556633");

		String email = randomString() + "gmail.com";
		addcust.custEmailId(email);
		addcust.custSubmit();

		Thread.sleep(2000);
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");

		if (res == true) {

			Assert.assertTrue(true);

		} else {

			Assert.assertTrue(false);

		}
		
	}

}

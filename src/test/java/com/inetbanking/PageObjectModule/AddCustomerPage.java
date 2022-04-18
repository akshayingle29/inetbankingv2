package com.inetbanking.PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[text()='New Customer']") WebElement linkAddNewCustomer;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "name") WebElement txtCustomerName;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "rad1") WebElement rdGender;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "dob") WebElement txtDob;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "addr") WebElement txtAddresses;
	
	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "city") WebElement txtCity;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "state") WebElement txtState;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "pinno") WebElement txtPinNo;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "telephoneno") WebElement txtTelephoneNo;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "emailid") WebElement txtEmailId;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "sub") WebElement txtSubmit;
	
	//@CacheLookup
	//@FindBy(how = How.ID, using = "") WebElement addClose;
	
	public void ClickAddNewCustomer() {
		
		linkAddNewCustomer.click();
	}
	
	public void custName(String cname) {
		
		txtCustomerName.sendKeys(cname);
		
	}
	
	public void custGender() {
		
		rdGender.click();
		
	}
	
	public void custDob(String mm, String dd, String yyyy) {
		
		txtDob.sendKeys(mm);
		txtDob.sendKeys(dd);
		txtDob.sendKeys(yyyy);
	}
	
	public void custAddresse(String caddress) {
		
		txtAddresses.sendKeys(caddress);
		
	}
	
	public void custCity(String ccity) {
		
		txtCity.sendKeys(ccity);
		
	}
	
	public void custState(String cstate) {
		
		txtState.sendKeys(cstate);
		
	}
	
	public void custPin(int cpin) {
		
		txtState.sendKeys(String.valueOf(cpin));   // Required when Need to change from int to String
		
	}

	public void custTelephoneNo(String ctelephone) {
	
		txtState.sendKeys(ctelephone);
	
	}
	
	public void custEmailId(String cemailid) {
		
		txtEmailId.sendKeys(cemailid);
	}
	
	public void custSubmit() {
		
		txtSubmit.click();
		
	}
	
	
}

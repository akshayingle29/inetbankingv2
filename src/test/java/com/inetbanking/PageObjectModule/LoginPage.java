package com.inetbanking.PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(name = "uid")
	private WebElement txtUserName;
	@FindBy(name = "password")
	private WebElement txtPassword;
	@FindBy(name = "btnLogin")
	private WebElement loginBtn;
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[15]/a")
	private WebElement logoutBtn;
	
	@FindBy(how = How.NAME, using="dismiss") private WebElement addDismiss;
	
	//      /html/body/div[3]/div/ul/li[15]/a       //a[text()='Log out']


	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void setUserName(String uname) {

		txtUserName.sendKeys(uname);

	}

	public void setPassword(String password) {

		txtPassword.sendKeys(password);

	}

	public void clickSubmit() {

		loginBtn.click();

	}

	public void clickLogout() {

		logoutBtn.click();
	}
	
	public void addClose() {
		
		addDismiss.click();
		
	}
}

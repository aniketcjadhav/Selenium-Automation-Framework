package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class LoginPage extends BrowserUtility {
	
	static final By emailTextBoxLocator = By.id("email");
	
	static final By passwordTextBoxLocator = By.id("passwd");
	
	static final By submitLoginButtonLocator =By.id("SubmitLogin");

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	public MyAccountPage doLoginWith(String emailAddress , String password)
	{
		enterText(emailTextBoxLocator, emailAddress);
		
		enterText(passwordTextBoxLocator, password);
		
		clickOn(submitLoginButtonLocator);
		
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());
		
		return myAccountPage;
	}
	
}

package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class HomePage extends BrowserUtility {

	private static final By SignInLinkLocator = By.xpath("//a[contains(text(),\"Sign\")]");
	
	public HomePage(WebDriver driver) {
		super(driver);
		
		goToWebsite("https://automationpractice.techwithjatin.com/");
		maximizeWindows();
		
	}
	
	public LoginPage gotoLoginPage()  //Page function , void return type cannot be used
	{
		clickOn(SignInLinkLocator);
		
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}
}

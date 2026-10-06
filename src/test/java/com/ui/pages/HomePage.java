package com.ui.pages;

import org.openqa.selenium.By;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import static com.utility.PropertiesUtil.*; //use static import dirct we can call method without classname.methodname

public final class HomePage extends BrowserUtility {

	private static final By SignInLinkLocator = By.xpath("//a[contains(text(),\"Sign\")]");
	
	public HomePage(Browser browserName) {
		super(browserName);
		
		goToWebsite(readProperty(QA, "URL"));
		maximizeWindows();
		
	}
	
	public LoginPage gotoLoginPage()  //Page function , void return type cannot be used
	{
		clickOn(SignInLinkLocator);
		
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}
}

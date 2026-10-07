package com.ui.pages;

import org.openqa.selenium.By;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;

import static com.utility.PropertiesUtil.*; //use static import dirct we can call method without classname.methodname

public final class HomePage extends BrowserUtility {

	private static final By SignInLinkLocator = By.xpath("//a[contains(text(),\"Sign\")]");
	
	public HomePage(Browser browserName) {
		super(browserName);
		
//		goToWebsite(readProperty(QA, "URL"));  //Properties file reading here QA is file name and URL is property name
		goToWebsite(JSONUtility.readJSON(QA)); //JSOn file reading to get variable value
		maximizeWindows();
		
	}
	
	public LoginPage gotoLoginPage()  //Page function , void return type cannot be used
	{
		clickOn(SignInLinkLocator);
		
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}
}

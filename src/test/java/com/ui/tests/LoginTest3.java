package com.ui.tests;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.ui.pojos.User;

public class LoginTest3 {
	
	HomePage homePage;
	
	@BeforeMethod(description = "Load HomePage of website")
	public void setUp()
	{
		homePage = new HomePage(Browser.CHROME);
	}
	
	@Test(description = "Verify to valid user should be able to login" , groups = {"e2e" , "sanity"},
			dataProviderClass = com.ui.dataproviders.LoginDataProvider.class ,dataProvider = "LoginTestDataProvider")
	public void loginTest(User user)
	{
		assertEquals(homePage.gotoLoginPage().doLoginWith(user.getEmailAddress(), user.getPassWord()).getUserName(), "Demo Dusa");
		
	}
	
}

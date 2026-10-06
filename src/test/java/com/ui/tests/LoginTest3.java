package com.ui.tests;

import org.testng.annotations.Test;

import com.constants.Browser;
import com.ui.pages.HomePage;

public class LoginTest3 {

	@Test
	public void loginTest()
	{
		HomePage homePage = new HomePage(Browser.CHROME);
		
		String userName =homePage.gotoLoginPage().doLoginWith("demo123@gmail.com", "Password123").getUserName();
		
		System.out.println(userName);
	}
}

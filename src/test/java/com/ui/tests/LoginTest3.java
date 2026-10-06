package com.ui.tests;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.constants.Browser;
import com.ui.pages.HomePage;

public class LoginTest3 {
	
	HomePage homePage;
	
	@BeforeMethod(description = "Load HomePage of website")
	public void setUp()
	{
		homePage = new HomePage(Browser.CHROME);
	}
	
	@Test(description = "Verify to valid user should be able to login" , groups = {"e2e" , "sanity"})
	public void loginTest()
	{
		assertEquals(homePage.gotoLoginPage().doLoginWith("demo123@gmail.com", "Password123").getUserName(), "Demo Dusa");
		
	}
	
}

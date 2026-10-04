package com.ui.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.constants.Browser;
import com.ui.pages.HomePage;

public class LoginTest2 {

	public static void main(String[] args) {
		
		HomePage homePage = new HomePage(Browser.CHROME);
		
		String userName =homePage.gotoLoginPage().doLoginWith("demo123@gmail.com", "Password123").getUserName();
		
		System.out.println(userName);
	}

}

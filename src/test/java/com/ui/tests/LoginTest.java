package com.ui.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTest {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		BrowserUtility browserutility = new BrowserUtility(driver);
		
		browserutility.goToWebsite("https://automationpractice.techwithjatin.com/");
		browserutility.maximizeWindows();
		
	
		
		
		By emailTextBoxLocator = By.id("email");
		browserutility.enterText(emailTextBoxLocator, "demo123@gmail.com");
		
		By passwordTextBoxLocator = By.id("passwd");
		browserutility.enterText(passwordTextBoxLocator, "Password123");
		
		By submitLoginButtonLocator =By.id("SubmitLogin");
		browserutility.clickOn(submitLoginButtonLocator);
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		driver.findElement(By.partialLinkText("Sig")).click();
		
//		driver.close();
	}

}

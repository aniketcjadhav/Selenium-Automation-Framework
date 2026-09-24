package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BrowserUtility {
	
	private WebDriver driver;

	public BrowserUtility(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public BrowserUtility(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if()
		{
			
		}
			
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public void goToWebsite( String websiteUrl)
	{
		driver.get(websiteUrl);
	}
	
	public void maximizeWindows()
	{
		driver.manage().window().maximize();
	}
	
	public void clickOn(By locator)
	{
		WebElement webElement = driver.findElement(locator); //find the element
		webElement.click();
	}
	
	public void enterText(By locator , String textToEnter)
	{
		WebElement webElement = driver.findElement(locator); //find the element
		webElement.sendKeys(textToEnter);
	}
	
	public String getVisibleText(By locator)
	{
		WebElement webElement = driver.findElement(locator); //find the element
		return webElement.getText();
	}
}

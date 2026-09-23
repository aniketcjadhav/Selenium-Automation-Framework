package com.ui.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.techwithjatin.com/");
		driver.manage().window().maximize();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		driver.findElement(By.partialLinkText("Sig")).click();
		
//		driver.close();
	}

}

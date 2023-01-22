package com.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class General  extends Global
{
	public void openBrowser()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Selenium\\chrome.exe");
		D1 = new ChromeDriver();
		D1.get(url);
		
	}
	
	public void closeBrowser()
	{
		D1.quit();
	}
	
	public void loginintoapp() throws Exception
	{
		Thread.sleep(5000);
		D1.findElement(By.xpath(txtun)).sendKeys(un);
		D1.findElement(By.xpath(txtpwd)).sendKeys(pwd);
				
		D1.findElement(By.xpath(btnlogin)).click();
		Thread.sleep(5000);
	}
	
	public void logout() throws Exception
	{
		D1.findElement(By.xpath(Dropdown)).click();
		Thread.sleep(3000);
		D1.findElement(By.linkText(linkLogout)).click();
	}

		
	}


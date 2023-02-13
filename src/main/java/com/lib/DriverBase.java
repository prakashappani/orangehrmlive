package com.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverBase {

    public static WebDriver driver = new ChromeDriver();

     DriverBase() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Selenium\\chrome.exe");
        driver.manage().window().maximize();
    }
}



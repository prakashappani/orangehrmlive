package com.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class DriverBase {

    public static WebDriver driver = new ChromeDriver();
    public DriverBase() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Selenium\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}



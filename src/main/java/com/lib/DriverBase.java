package com.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class DriverBase {

    public static WebDriver driver = new ChromeDriver();
    public DriverBase() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
}



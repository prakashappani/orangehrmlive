package com.lib;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class DriverBase {
    static WebDriver driver;
    String headless = System.getProperty("headless");
    ChromeOptions options = new ChromeOptions();

    public DriverBase() {
        if (driver == null) {
            if (headless != null && headless.equals("true")) {
                System.out.println(headless);
                options.setHeadless(true);
            }
            driver = new ChromeDriver(options);
//            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome.exe");
//            driver.manage().window().maximize();
            driver.manage().window().setSize(new Dimension(1920, 1080));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
    }
}



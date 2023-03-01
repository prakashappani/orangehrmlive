package com.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class OneTest {
    public String baseURL = "https://opensource-demo.orangehrmlive.com/";
    public String username_xPath = "//input[@name='username']";
    public String password_xPath = "//input[@name='password']";
    public String login_xPath = "//button[@type='submit']";
    public String dropDown_xPath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']";
    public String logout_xPath = "Logout";

    @Test
    public void myTest(){

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseURL);
        driver.findElement(By.xpath(username_xPath)).sendKeys("Admin");
        driver.findElement(By.xpath(password_xPath)).sendKeys("admin123");
        driver.findElement(By.xpath(login_xPath)).click();
        driver.findElement(By.xpath(dropDown_xPath)).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(logout_xPath)));
        webElement.click();
    }
}

package com.lib;

import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.time.Duration;

public class HrmGlobalGeneral extends DriverBase implements HrmGlobalVariables {

    public void logintoApp(String sheetname) throws Exception {
        FileInputStream UserFile = new FileInputStream("./Users.xls");
        Workbook workbook = Workbook.getWorkbook(UserFile);
        Sheet s2 = workbook.getSheet(sheetname);

        String username = s2.getCell(1, 1).getContents();
        String password = s2.getCell(2, 1).getContents();
        logintoApp(username, password);
    }

    public void logintoApp(String username, String password) throws Exception {
        driver.findElement(By.xpath(username_xPath)).sendKeys(username);
        driver.findElement(By.xpath(password_xPath)).sendKeys(password);
        driver.findElement(By.xpath(login_xPath)).click();
    }

    public void invalidCredentials() throws Exception {
        WebElement element = driver.findElement(By.xpath(invalid_credentials));
        element.getText();
        Assert.assertEquals(element.getText(),"Invalid credentials");
    }

    public void logout() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropDown_xPath)));
        webElement.click();

        webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(logout_xPath)));
        webElement.click();
    }
    public void setUp() {
        driver.get(baseURL);
    }
    public void tearDown()  {
        driver.quit();
    }
}
	


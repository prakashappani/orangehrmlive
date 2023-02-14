package com.lib;

import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;

import java.io.FileInputStream;

public class HrmGlobalGeneral extends DriverBase implements HrmGlobalVariables {
    public void openBrowser() {
        System.out.println("FROM: openBrowser");
        driver.get(baseURL);
    }

    public void closeBrowser() {
        System.out.println("FROM: closeBrowser");
        driver.quit();
    }

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

    public void logout() throws Exception {
        driver.findElement(By.xpath(dropDown_xPath)).click();
        driver.findElement(By.linkText(logout_xPath)).click();
    }

}
	


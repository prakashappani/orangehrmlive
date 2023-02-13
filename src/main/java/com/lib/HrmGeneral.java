package com.lib;

import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;

public class HrmGeneral extends  DriverBase implements HrmGlobal  {
    public void openBrowser() {
        System.out.println("FROM: openBrowser");
        driver.get(url);
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
        Thread.sleep(2000);
        driver.findElement(By.xpath(username_xPath)).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.xpath(password_xPath)).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void logout() throws Exception {
        driver.findElement(By.xpath(dropDown)).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText(logout_xPath)).click();
    }


    public void admintab() throws Exception {
        driver.findElement(By.xpath(admintab_xPath)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(addbtn_xPath)).click();
        System.out.println("admintab: admintab");

    }

    public void addUser(String sheetname) throws Exception {
        FileInputStream UserFile = new FileInputStream("./Users.xls");
        Workbook workbook = Workbook.getWorkbook(UserFile);
        Sheet s3 = workbook.getSheet(sheetname);

        String urole = s3.getCell(0, 1).getContents();
        String empName = s3.getCell(1, 1).getContents();
        String status = s3.getCell(2, 1).getContents();
        String uName = s3.getCell(3, 1).getContents();
        String password = s3.getCell(4, 1).getContents();
        String confirmpwd = s3.getCell(5, 1).getContents();

        addUser(urole, empName, status, uName, password, confirmpwd);

    }
    public void addUser(String urole, String empname, String status, String uName, String Passwd, String Confirmpwd) throws Exception {
        Thread.sleep(2000);

        driver.findElement(By.xpath(userRole_xPath)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(String.format(userRoleSel_xPath,urole))).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath(eName_xPath)).sendKeys(empname);
        Thread.sleep(2000);

        driver.findElement(By.xpath(eNameDropdown_xPath)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(status_xPath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(String.format(userRoleSel_xPath,status))).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(userName_xPath)).sendKeys(uName);
        Thread.sleep(2000);

        driver.findElement(By.xpath(passWord_xPath)).sendKeys(Passwd);
        Thread.sleep(2000);

        driver.findElement(By.xpath(confirm_Pass_xPath)).sendKeys(Confirmpwd);
        Thread.sleep(2000);
    }

}
	


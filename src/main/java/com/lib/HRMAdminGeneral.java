package com.lib;

import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;

import java.io.FileInputStream;

public class HRMAdminGeneral extends DriverBase implements  HRMAdminVariables{
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
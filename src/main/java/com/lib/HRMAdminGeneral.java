package com.lib;

import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;

import java.io.FileInputStream;

public class HRMAdminGeneral extends DriverBase implements HRMAdminVariables {
    public void adminTab() throws Exception {
        driver.findElement(By.xpath(admintab_xPath)).click();
        driver.findElement(By.xpath(addbtn_xPath)).click();
    }

    public void addUser(String sheetname) throws Exception {
        FileInputStream UserFile = new FileInputStream("./Users.xls");
        Workbook workbook = Workbook.getWorkbook(UserFile);
        Sheet s3 = workbook.getSheet(sheetname);

        String urole = s3.getCell(0, 1).getContents();
        String empName = s3.getCell(1, 1).getContents();
        String status = s3.getCell(2, 1).getContents();
        String uName = s3.getCell(3, 1).getContents();
        String pwd = s3.getCell(4, 1).getContents();
        String conPwd = s3.getCell(5, 1).getContents();

        addUser(urole, empName, status, uName, pwd, conPwd);

    }

    public void addUser(String urole, String empname, String status, String uName, String passwd, String confirmPwd) throws Exception {
        driver.findElement(By.xpath(userRole_xPath)).click();
        driver.findElement(By.xpath(String.format(userRoleSel_xPath, urole))).click();
        driver.findElement(By.xpath(eName_xPath)).sendKeys(empname);
        driver.findElement(By.xpath(eNameDropdown_xPath)).click();
        driver.findElement(By.xpath(status_xPath)).click();
        driver.findElement(By.xpath(String.format(userRoleSel_xPath, status))).click();
        driver.findElement(By.xpath(userName_xPath)).sendKeys(uName);
        driver.findElement(By.xpath(passWord_xPath)).sendKeys(passwd);
        driver.findElement(By.xpath(confirm_Pass_xPath)).sendKeys(confirmPwd);
    }
}

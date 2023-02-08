package com.lib;

import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.util.List;

import org.openqa.selenium.support.ui.Select;

public class HrmGeneral extends HrmGlobal {
    public void openBrowser() {
        System.out.println("openBrowser");
        driver = new ChromeDriver();
        System.setProperty("Webdriver.chrome.driver", "C:\\Selenium\\chrome.exe");
        driver.get(url);
    }

    public void closeBrowser() {
        System.out.println("closeBrowser");
        driver.quit();
    }

    public void loginintoapp(String sheetname) throws Exception {
        FileInputStream UserFile = new FileInputStream("./Users.xls");
        userwb = Workbook.getWorkbook(UserFile);
        Sheet s2 = userwb.getSheet(sheetname);
        int rows = s2.getRows();
        for (int i = 1; i < 2; i++) {
            // String x=s1.getCell(0,i).getContents();
            userName = s2.getCell(1, i).getContents();
            passwd = s2.getCell(2, i).getContents();
            // System.out.print(x+"\t");
            Thread.sleep(2000);

            driver.findElement(By.xpath(txtun)).sendKeys(userName);
            driver.findElement(By.xpath(txtpwd)).sendKeys(passwd);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            System.out.print(userName + "\t");
            System.out.print(passwd + "\n");
        }
    }

    public void logout() throws Exception {
        driver.findElement(By.xpath(dropDown)).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText(linkLogout)).click();
    }


    public void admintab() throws Exception {
        driver.findElement(By.xpath(admintab)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(addbtn)).click();
        System.out.println("admintab: admintab");

    }

    public void addUser(String sheetname) throws Exception {
        FileInputStream UserFile = new FileInputStream("./Users.xls");
        userwb = Workbook.getWorkbook(UserFile);
        Sheet s3 = userwb.getSheet(sheetname);

        urole = s3.getCell(0, 1).getContents();
        empname = s3.getCell(1, 1).getContents();
        status = s3.getCell(2, 1).getContents();
        uName = s3.getCell(3, 1).getContents();
        Passwd = s3.getCell(4, 1).getContents();
        Confirmpwd = s3.getCell(5, 1).getContents();

        addUser(urole, empname, status, userName, Passwd, Confirmpwd);

    }
    public void addUser(String urole, String empname, String status, String uName, String Passwd, String Confirmpwd) throws Exception {
        Thread.sleep(2000);

        driver.findElement(By.xpath(userRolepath)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(String.format(selectionPath,urole))).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath(eNamepath)).sendKeys(empname);
        Thread.sleep(2000);

        driver.findElement(By.xpath(eNamepathDropdownPath)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(statpath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(String.format(selectionPath,status))).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(userNamePath)).sendKeys(uName);
        Thread.sleep(2000);

        driver.findElement(By.xpath(passWordpath)).sendKeys(Passwd);
        Thread.sleep(2000);

        driver.findElement(By.xpath(conPwdpath)).sendKeys(Confirmpwd);
        Thread.sleep(2000);
    }

}
	


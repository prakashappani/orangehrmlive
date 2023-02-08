package com.testscripts;

import com.lib.HrmGeneral;
import jxl.Sheet;
import jxl.Workbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class Tc02 {
    HrmGeneral hrmGeneral;

    /*
    Test case runs at the beginning of the tests
     */
    @BeforeTest
    public void setUp() {
        hrmGeneral = new HrmGeneral();
        hrmGeneral.openBrowser();
    }

    @Test
    public void negativeTest() throws Exception {
        hrmGeneral.loginintoapp("Negative");
    }

    @Test(dependsOnMethods = "negativeTest")
    public void positiveTest() throws Exception {
        hrmGeneral.loginintoapp("Positive");
        Thread.sleep(5000);
    }


    @Test(dependsOnMethods = "positiveTest")
    public void admintabTest() throws Exception {
        hrmGeneral.admintab();
    }

    @Test(dependsOnMethods = "admintabTest")
    public void addUserTest() throws Exception {
        hrmGeneral.addUser("Admin");
    }

    @Test(dependsOnMethods = {"admintabTest"})
    public void addOneUserTest() throws Exception {
        hrmGeneral.addUser("Admin", "Paul Collings", "Enabled", "pappani", "Abcd_1234", "Abcd_1234");
    }

    /*
    Data Provider Example
    */
    @DataProvider(name = "createUsers")
    public Object[][] createData() throws Exception {
        FileInputStream UserFile = new FileInputStream("./Users.xls");
        Workbook userwb = Workbook.getWorkbook(UserFile);
        Sheet sheet = userwb.getSheet("Admin");
        Object[][] data = new Object[4][6];
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 6; column++) {
                data[row][column] = sheet.getCell(column, row + 1).getContents();
            }
        }
        return data;
    }

    /*
    Test Class which uses Data Provider
    */
    @Test(dataProvider = "createUsers", dependsOnMethods = {"admintabTest"})
    public void addUsersTest(String urole, String empname, String status, String userName, String Passwd, String Confirmpwd) throws Exception {
        hrmGeneral.addUser(urole, empname, status, userName, Passwd, Confirmpwd);
    }

    /*
    Test case runs at the end of the tests
     */
    @AfterTest
    public void tearDown() throws Exception {
        hrmGeneral.logout();
        hrmGeneral.closeBrowser();
    }

}
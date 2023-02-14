package com.testScripts;

import com.lib.HRMAdminGeneral;
import jxl.Sheet;
import jxl.Workbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class HRMAdmin extends BaseTest{
    HRMAdminGeneral hrmAdminGeneral = new HRMAdminGeneral();

    @DataProvider(name = "createDataNegativeTest")
    public Object[][] createDataNegativeTest() throws Exception {
        FileInputStream UserFile = new FileInputStream("./Users.xls");
        Workbook userwb = Workbook.getWorkbook(UserFile);
        Sheet sheet = userwb.getSheet("Negative");
        Object[][] data = new Object[2][2];
        for (int row = 0; row < 2; row++) {
            data[row][0] = sheet.getCell(1, row + 1).getContents();
            data[row][1] = sheet.getCell(2, row + 1).getContents();
        }
        return data;
    }
    @Test(dataProvider = "createDataNegativeTest")
    public void negativeTest(String username, String password) throws Exception {
        hrmGeneral.logintoApp(username, password);
    }

    @Test(dependsOnMethods = "negativeTest")
    public void loginAppTest() throws Exception {
        hrmGeneral.logintoApp("Positive");
    }


    @Test(dependsOnMethods = "loginAppTest")
    public void adminTabTest() throws Exception {
        hrmAdminGeneral.adminTab();
    }

    @Test(dependsOnMethods = "adminTabTest")
    public void addUserTest() throws Exception {
        hrmAdminGeneral.addUser("Admin");
    }

    @Test(dependsOnMethods = {"adminTabTest"})
    public void addOneUserTest() throws Exception {
        hrmAdminGeneral.addUser("Admin", "Paul Collings", "Enabled", "pappani", "Abcd_1234", "Abcd_1234");
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
    @Test(dataProvider = "createUsers", dependsOnMethods = {"adminTabTest"})
    public void addUsersTest(String urole, String empname, String status, String userName, String Passwd, String Confirmpwd) throws Exception {
        hrmAdminGeneral.addUser(urole, empname, status, userName, Passwd, Confirmpwd);
    }

    @Test(priority = 99)
    public void logoutTest() throws Exception {
        hrmGeneral.logout();
    }

}
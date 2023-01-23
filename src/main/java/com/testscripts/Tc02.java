package com.testscripts;

import com.lib.HrmGeneral;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
        hrmGeneral.openBrowser();
        hrmGeneral.loginintoapp("Negative");
    }

    @Test (dependsOnMethods = "negativeTest")
    public void positiveTest() throws Exception {
        hrmGeneral.loginintoapp("Positive");
        Thread.sleep(5000);
    }

    @Test
    public void addUserTest() throws Exception {
        hrmGeneral.loginintoapp("Positive");
        Thread.sleep(5000);
        hrmGeneral.admintab();
        hrmGeneral.addUser("Admin");
    }

    @Test (priority = 9)
    public void admintabTest() throws Exception {
         Thread.sleep(5000);
        hrmGeneral.admintab();
    }

    /*
    Data Provider Example
    */
    @DataProvider(name = "createUsers")
    public Object[][] createData() throws Exception {
        Object[][] data = hrmGeneral.getData("Admin");
        return data;

    }

    /*
    Test Class which uses Data Provider
    */
    @Test(dataProvider = "createUsers", dependsOnMethods = {"admintabTest"})
    public void addUsersTest(String urole, String empname, String status, String userName, String Passwd, String Confirmpwd) throws Exception {
        hrmGeneral.addUser(urole, empname, status, userName, Passwd, Confirmpwd);
    }


    @Test(dependsOnMethods = {"admintabTest"})
    public void addOneUserTest() throws Exception {
        hrmGeneral.addUser("Admin", "Paul Collings", "Enabled", "pappani", "Abcd_1234", "Abcd_1234");
    }

    /*
    Test case runs at the end of the tests
     */
    @AfterTest
    public void tearDown() {
        hrmGeneral.closeBrowser();
    }
}
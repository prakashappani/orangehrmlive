package com.testscripts;

import com.lib.HrmGeneral;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tc02 {
    HrmGeneral hrmGeneral;


    @BeforeTest
    public void setUp() {
        hrmGeneral = new HrmGeneral();
        hrmGeneral.openBrowser();
    }


    //@Test
    public void negativeTest() throws Exception {
        hrmGeneral.loginintoapp("Negative");
    }

    //@Test
    public void positiveTest() throws Exception {
        hrmGeneral.loginintoapp("Positive");
        Thread.sleep(5000);
        hrmGeneral.logout();
    }

    //	@Test
    public void addUserTest() throws Exception {
        hrmGeneral.loginintoapp("Positive");
        Thread.sleep(5000);
        hrmGeneral.admintab();
        hrmGeneral.addUser("Admin");
        //Gn.logout();
    }

    @Test
    public void admintabTest() throws Exception {
        hrmGeneral.loginintoapp("Positive");
        Thread.sleep(5000);
        hrmGeneral.admintab();
    }

    @DataProvider(name = "createUsers")
    public Object[][] createData() throws Exception {
        Object[][] data = hrmGeneral.getData("Admin");
        return data;

    }

    @Test(dataProvider = "createUsers", dependsOnMethods = {"admintabTest"})
    public void addUsersTest(String urole, String empname, String status, String userName, String Passwd, String Confirmpwd) throws Exception {
        hrmGeneral.addUser(urole, empname, status, userName, Passwd, Confirmpwd);
        ;
    }

    @Test(dependsOnMethods = {"admintabTest"})
    public void addUserTest1() throws Exception {
        hrmGeneral.addUser("Admin", "Paul Collings ", "Enabled", "pappani", "Abcd_1234", "Abcd_1234");
        ;
    }

    @AfterTest
    public void tearDown() {
        hrmGeneral.closeBrowser();
    }
}
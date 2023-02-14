package com.testScripts;

import com.lib.HrmGlobalGeneral;
import com.lib.HRMLeaveGeneral;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMLeaves {
    HrmGlobalGeneral hrmGeneral = new HrmGlobalGeneral();
    HRMLeaveGeneral hrmLeaveGeneral = new HRMLeaveGeneral();

    @BeforeTest
    public void setUp() {
        hrmGeneral.openBrowser();
    }

    @Test
    public void loginAppTest() throws Exception {
        hrmGeneral.logintoApp("Positive");
    }

    @Test(dependsOnMethods = "loginAppTest")
    public void leaveSearchTest() throws InterruptedException {
        hrmLeaveGeneral.addLeave();
    }

    @Test(priority = 99)
    public void logoutTest() throws Exception {
        hrmGeneral.logout();
    }

    /*
    Test case runs at the end of the tests
     */
    @AfterTest
    public void tearDown() throws Exception {
        hrmGeneral.closeBrowser();
    }
}

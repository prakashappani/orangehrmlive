package com.testscripts;

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
    public void positiveTest() throws Exception {
        hrmGeneral.logintoApp("Positive");
    }

    @Test(dependsOnMethods = "positiveTest")
    public void leaveSearch() throws InterruptedException {
        hrmLeaveGeneral.addLeave();
    }

    @Test(priority = 99)
    public void logout() throws Exception {
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

package com.testscripts;

import com.lib.HrmGeneral;
import com.lib.HRMLeaveGeneral;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMLeaves {
    HrmGeneral hrmGeneral = new HrmGeneral();
    HRMLeaveGeneral hrmLeaveGeneral = new HRMLeaveGeneral();

    @BeforeTest
    public void setUp() {
        hrmGeneral.openBrowser();
    }

    @Test
    public void positiveTest() throws Exception {
        hrmGeneral.logintoApp("Positive");
        Thread.sleep(5000);
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

package com.testScripts;

import com.lib.HRMLeaveGeneral;
import com.lib.HrmGlobalGeneral;
import org.testng.annotations.Test;

public class HRMLeaves extends BaseTest{
    HRMLeaveGeneral hrmLeaveGeneral = new HRMLeaveGeneral();
    HrmGlobalGeneral hrmGeneral = new HrmGlobalGeneral();

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

}

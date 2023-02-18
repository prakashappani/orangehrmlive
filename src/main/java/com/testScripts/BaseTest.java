package com.testScripts;

import com.lib.DriverBase;
import com.lib.HrmGlobalGeneral;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    HrmGlobalGeneral hrmGeneral = new HrmGlobalGeneral();
    @BeforeSuite
    public void setUp() {
        hrmGeneral.setUp();
    }
    @AfterSuite
    public void tearDown() throws Exception {
        hrmGeneral.tearDown();
    }
}

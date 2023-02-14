package com.testScripts;

import com.lib.HrmGlobalGeneral;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    HrmGlobalGeneral hrmGeneral = new HrmGlobalGeneral();

    /*
    Test case runs at the beginning of the tests
     */
    @BeforeSuite
    public void setUp() {
        hrmGeneral.openBrowser();
    }

    /*
     Test case runs at the end of the tests
      */
    @AfterSuite
    public void tearDown() throws Exception {
        hrmGeneral.closeBrowser();
    }
}

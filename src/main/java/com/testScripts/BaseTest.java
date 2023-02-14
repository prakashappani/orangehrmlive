package com.testScripts;

import com.lib.HrmGlobalGeneral;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    HrmGlobalGeneral hrmGeneral = new HrmGlobalGeneral();

    /*
    Test case runs at the beginning of the tests
     */
    @BeforeTest
    public void setUp() {
        hrmGeneral.openBrowser();
    }

    /*
     Test case runs at the end of the tests
      */
    @AfterTest
    public void tearDown() throws Exception {
        hrmGeneral.closeBrowser();
    }
}

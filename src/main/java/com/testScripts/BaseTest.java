package com.testScripts;

import com.lib.DriverBase;
import com.lib.HrmGlobalGeneral;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends DriverBase {
    public String baseURL = "https://opensource-demo.orangehrmlive.com/";
    BaseTest(){
        super();
    }
    /*
    Test case runs at the beginning of the tests
     */
    @BeforeSuite
    public void setUp() {
        driver.get(baseURL);

    }

    /*
     Test case runs at the end of the tests
      */
    @AfterSuite
    public void tearDown() throws Exception {
        driver.quit();

    }
}

package com.cucumber.stepDefinitions;

import com.lib.HRMAdminGeneral;
import com.lib.HRMLeaveGeneral;
import com.lib.HrmGlobalGeneral;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.BeforeAll;

public class OrangeHRMLoginPage {
    static HrmGlobalGeneral hrmGeneral = new HrmGlobalGeneral();
    HRMAdminGeneral hrmAdminGeneral = new HRMAdminGeneral();
    HRMLeaveGeneral hrmLeaveGeneral = new HRMLeaveGeneral();

    @BeforeAll
    public static void before_all(){
        hrmGeneral.setUp();
    }

    @AfterAll
    public static void after_all(){
        hrmGeneral.tearDown();
    }

    @Given("I login OrangeHRM Application with {string} and {string}")
    public void i_login_orange_hrm_application(String username, String password)  throws Exception{
        hrmGeneral.logintoApp(username,password);
    }

    @Given("I login OrangeHRM Application")
    public void i_login_orange_hrm_application() throws Exception {
        i_login_orange_hrm_application("Admin","admin123");
    }
    @When("I click on Admin Tab")
    public void i_click_on_admin_tab() throws Exception {
        hrmAdminGeneral.adminTab();
    }
    @Then("I logout of Application")
    public void i_logout_of_application() throws Exception {
        hrmGeneral.logout();
    }

    @When("I click on Leave Tab")
    public void i_click_on_leave_tab() throws Exception {
        hrmLeaveGeneral.addLeave();
    }

    @Then("I should see Invalid credentials message")
    public void i_should_see_invalid_credentials_message() throws Exception {
        hrmGeneral.invalidCredentials();
    }

}

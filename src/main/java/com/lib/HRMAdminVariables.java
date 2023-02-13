package com.lib;

public interface HRMAdminVariables {
    public String admintab_xPath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']";
    public String addbtn_xPath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']";
    public String userRole_xPath = "(//div[@class='oxd-select-text-input'])[1]";
    public String userRoleSel_xPath = "//span[contains(text(), '%s')]";
    public String eName_xPath = "//label[text()='Employee Name']//following::input[1]";
    public String eNameDropdown_xPath = "//div[@class='oxd-autocomplete-dropdown --positon-bottom']";
    public String status_xPath = "(//div[@class='oxd-select-text-input'])[2]";
    public String userName_xPath = "//label[text()='Username']//following::input[1]";
    public String passWord_xPath = "//label[text()='Password']//following::input[1]";
    public String confirm_Pass_xPath = "//label[text()='Password']//following::input[2]";
}

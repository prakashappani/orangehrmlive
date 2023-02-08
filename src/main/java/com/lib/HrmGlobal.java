package com.lib;


import jxl.Workbook;
import org.openqa.selenium.WebDriver;


public class HrmGlobal {
    public WebDriver driver;
    public String url = "https://opensource-demo.orangehrmlive.com/";
    public String userName;
    public String passwd;
    public Workbook userwb;
    public String urole;
    public String empname;
    public String status;
    public String uName;
    public String Passwd;
    public String Confirmpwd;

//Objects

    public String txtun = "//input[@name='username']";
    public String txtpwd = "//input[@name='password']";
    public String dropDown = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']";
    public String linkLogout = "Logout";

    //objects
    public String admintab = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']";
    public String addbtn = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']";

    //objects AddUser
    public String userRolepath = "(//div[@class='oxd-select-text-input'])[1]";
    public String selectionPath = "//span[contains(text(), '%s')]";

    public String eNamepath  = "//label[text()='Employee Name']//following::input[1]";
    public String eNamepathDropdownPath  = "//div[@class='oxd-autocomplete-dropdown --positon-bottom']";
    public String statpath = "(//div[@class='oxd-select-text-input'])[2]";
    public String userNamePath = "//label[text()='Username']//following::input[1]";
    public String passWordpath = "//label[text()='Password']//following::input[1]";
    public String conPwdpath = "//label[text()='Password']//following::input[2]";
    
}



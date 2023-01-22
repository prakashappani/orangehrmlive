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
    public String btnlogin = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]";
    public String dropDown = "//header/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]";
    public String linkLogout = "Logout";

    //objects
    public String admintab = "//ul[@class='oxd-main-menu']//li//a[1]";
    public String addbtn = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']";

    //objects AddUser
    public String userRolepath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]";
    public String eNamepath  = "//*[text()='Employee Name']//following::input[1]";
    public String eNamepathDropdownPath  = "//div[@class='oxd-autocomplete-dropdown --positon-bottom']";
    public String statpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]";
    public String userNamePath = "//*[text()='Username']//following::input[1]";
    public String passWordpath = "//*[text()='Password']//following::input[1]";
    public String conPwdpath = "//*[text()='Password']//following::input[2]";


}


